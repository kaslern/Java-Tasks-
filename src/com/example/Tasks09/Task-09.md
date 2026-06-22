# System rezerwacji lotów (Java) — praca domowa

Napisz program w Javie, który symuluje podstawy systemu rezerwacji lotów między **różnymi strefami czasowymi**. Celem zadania jest poprawne zrozumienie i wykorzystanie API `java.time` (strefy IANA, zmiany czasu, linia zmiany daty) oraz walidacji czasu lotu.

---

## Wymagania funkcjonalne

1. Utwórz klasę `Flight` (lub `Lot` – wybierz jedną konwencję i trzymaj się jej) z polami:

    * `String flightNumber`
    * `String departureAirport` (np. IATA: `WAW`)
    * `String arrivalAirport` (np. `JFK`)
    * `CZAS departureTime` — czas lokalny lotniska wylotu (strefa **IANA**)
    * `CZAS arrivalTime` — czas lokalny lotniska przylotu (strefa **IANA**)

2. Dodaj metodę:

   ```java
   public Duration calculateFlightDuration(...)
   ```

3. Walidacje:

    * `arrivalTime` musi być **po** `departureTime` w ujęciu `Instant` – w przeciwnym razie rzuć `IllegalArgumentException` (lub własny `InvalidFlightTimeException`).
    * Przy tworzeniu stref (`ZoneId.of(...)`) dla niepoprawnej nazwy rzuć błąd – oczekiwany jest `DateTimeException` (często specyficznie `ZoneRulesException`).
    * Zwróć uwagę na **nieistniejące** lub **dwuznaczne** lokalne czasy w dniach zmiany czasu (DST). Domyślnie przyjmij, że:

        * w czasie cofania ("fall‑back") wybierany jest **wcześniejszy** offset,
        * w czasie przejścia na letni ("spring‑forward") lokalne czasy z nieistniejącej godziny są **niedozwolone** i powinny prowadzić do wyjątku lub jawnej korekty — wybierz jedną politykę i opisz ją w kodzie/testach.

4. (Opcjonalnie) Dodaj prostą mapę IATA→`ZoneId` (np. `WAW -> Europe/Warsaw`, `JFK -> America/New_York`) oraz fabrykę do budowy `ZonedDateTime` z `LocalDateTime` + `ZoneId`.

---

## Przypadki testowe (zaakceptowane wyniki)

> Wszystkie daty i godziny w formacie `yyyy-MM-dd HH:mm:ss (Strefa/IANA)`.
> Zimą: `Europe/Warsaw` = UTC+1; latem = UTC+2. UK zimą nie ma DST (UTC+0).

1. **Ta sama strefa**

    * Wylot: `2025-01-15 10:00:00 (Europe/Warsaw)`
    * Przylot: `2025-01-15 12:30:00 (Europe/Warsaw)`
    * **Oczekiwane:** `2h 30m`

2. **Na inny dzień (ta sama strefa)**

    * Wylot: `2025-01-15 23:00:00 (Europe/Warsaw)`
    * Przylot: `2025-01-16 01:30:00 (Europe/Warsaw)`
    * **Oczekiwane:** `2h 30m`

3. **Międzystrefowy (WAW → NYC)**

    * Wylot: `2025-01-15 10:00:00 (Europe/Warsaw)`
    * Przylot: `2025-01-15 14:00:00 (America/New_York)`
    * **Oczekiwane:** `10h`
      *Wyjaśnienie: 09:00Z → 19:00Z.*

4. **Zmiana na czas letni (spring‑forward)**

    * Wylot: `2025-03-30 01:00:00 (Europe/Warsaw)`
    * Przylot: `2025-03-30 05:00:00 (Europe/Warsaw)`
    * **Oczekiwane:** `3h`
      *Godzina 02:00–02:59 nie istnieje.*

5. **Zmiana na czas zimowy (fall‑back)**

    * Wylot: `2025-10-26 01:00:00 (Europe/Warsaw)`
    * Przylot: `2025-10-26 02:30:00 (Europe/Warsaw)`
    * **Oczekiwane:** `1h 30m`
      *Uwaga: 02:30 występuje dwa razy; przyjmujemy wcześniejszy offset.*

6. **Linia zmiany daty (Tokyo → LA)**

    * Wylot: `2025-01-15 10:00:00 (Asia/Tokyo)`
    * Przylot: `2025-01-14 18:00:00 (America/Los_Angeles)`
    * **Oczekiwane:** `1h`
      *01:00Z → 02:00Z (to przykład „szkolny”, a nie realistyczny).*

7. **Nieprawidłowa strefa czasowa**

    * Próba: `ZoneId.of("Invalid/Zone")`
    * **Oczekiwane:** wyjątek `DateTimeException` (np. `ZoneRulesException`).

8. **Przylot przed wylotem (ta sama strefa)**

    * Wylot: `2025-01-15 10:00:00 (Europe/Warsaw)`
    * Przylot: `2025-01-15 08:00:00 (Europe/Warsaw)`
    * **Oczekiwane:** wyjątek `IllegalArgumentException` (walidacja po `Instant`).

9. **Brak DST w miejscu przylotu (WAW → Kolkata)**

    * Wylot: `2025-01-15 10:00:00 (Europe/Warsaw)`
    * Przylot: `2025-01-15 19:00:00 (Asia/Kolkata)`
    * **Oczekiwane:** `4h 30m`
      *09:00Z → 13:30Z.*

10. **Długi lot (WAW → Singapore)**

    * Wylot: `2025-01-15 06:00:00 (Europe/Warsaw)`
    * Przylot: `2025-01-16 06:00:00 (Asia/Singapore)`
    * **Oczekiwane:** `17h`
      *05:00Z (15.01) → 22:00Z (15.01).*

11. **W obie strony tego samego dnia (WAW ↔ LON, zima)**

    * WAW → LON: `2025-01-15 08:00:00 (Europe/Warsaw)` → `2025-01-15 12:00:00 (Europe/London)`

        * **Oczekiwane:** `5h`  *(07:00Z → 12:00Z)*
    * LON → WAW: `2025-01-15 16:00:00 (Europe/London)` → `2025-01-15 20:00:00 (Europe/Warsaw)`

        * **Oczekiwane:** `3h`  *(16:00Z → 19:00Z)*

---