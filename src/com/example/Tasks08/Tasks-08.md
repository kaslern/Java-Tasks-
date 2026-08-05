## Zadanie 1: Walidator hasła (unchecked)

**Treść:** Napisz klasę `PasswordValidator` z metodą statyczną `validate(String pwd)`, która:

* rzuca `IllegalArgumentException`, gdy `pwd == null` lub długość `< 8`,
* rzuca `IllegalArgumentException`, gdy brak co najmniej jednej cyfry,
* w komunikacie podaje powód (np. `length<8`, `no digit`).

**Szkielet:**

```java
public final class PasswordValidator {
    private PasswordValidator() {}

    public static void validate(String pwd) {
        // TODO: walidacja wg opisu; rzucaj IllegalArgumentException z jasnym komunikatem
    }
}
```

---

## Zadanie 2: Parser liczby dodatniej (chaining, unchecked)

**Treść:** Napisz `NumberParser.parsePositiveInt(String s)`:

* użyj `Integer.parseInt(s)`,
* jeśli `NumberFormatException` → rzuć własny **unchecked** z komunikatem `Invalid number: '<s>'` i **ustaw cause**,
* jeśli liczba ≤ 0 → rzuć `IllegalArgumentException("non-positive: " + value)`.

**Szkielet:**

```java
class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) { super(msg, cause); }
}

final class NumberParser {
    static int parsePositiveInt(String s) {
        // TODO: parsowanie, obsługa NFE -> wrap w InvalidNumberException z cause
        return 0;
    }
}
```

---

## Zadanie 3: Konto i wyjątek checked (`throws`)

**Treść:** Zaprojektuj prostą klasę `BankAccount`:

* Pole `balance` (int, grosze lub jednostki – jak wolisz).
* Metoda `withdraw(int amount) throws InsufficientFundsException` – gdy `amount > balance`, rzuć **checked** `InsufficientFundsException` z kontekstem (`balance`, `amount`).
* W metodzie demonstracyjnej (`main`) obsłuż wyjątek w `catch` i dodaj blok `finally` wypisujący np. `Koniec transakcji`.

**Szkielet:**

```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}

final class BankAccount {
    private int balance;
    public BankAccount(int initial) { this.balance = initial; }

    public void withdraw(int amount) throws InsufficientFundsException {
        // TODO: gdy amount > balance -> throw new InsufficientFundsException(...)
        // w p.p. zmniejsz balance
    }
}
```

---

## Zadanie 4: Multi‑catch i decyzja o reakcji

**Cel:** Umiejętność łączenia pokrewnych wyjątków.

**Treść:** Napisz metodę `processCommand(String cmd)`:

* dla `"ARG"` rzuć `IllegalArgumentException("bad arg")`,
* dla `"STATE"` rzuć `IllegalStateException("bad state")`,
* w metodzie `demo()` wywołuj `processCommand` z różnymi wartościami i użyj **multi‑catch**:
  `catch (IllegalArgumentException | IllegalStateException e) { /* wspólna reakcja */ }`.

**Szkielet:**

```java
final class CommandProcessor {
    static void processCommand(String cmd) {
        // TODO: warunki i rzucanie wyjątków
    }
    static void demo() {
        // TODO: wywołania + multi-catch
    }
}
```

---

## Zadanie 5: Walidacja adresu e-mail (regex)

**Treść:** Napisz klasę `EmailValidator` z metodą statyczną `validate(String email)`, która:

* rzuca **własny, domenowy wyjątek**, gdy `email == null` lub jest pusty/blank,
* rzuca **własny, domenowy wyjątek**, gdy adres nie pasuje do wzorca poprawnego e-maila (np. brak `@`, brak domeny, brak rozszerzenia po kropce),
* w komunikacie podaje powód (np. `email is null`, `invalid format: <email>`).

**Wymagania dot. wyjątków:**

* Zaprojektuj **własną hierarchię wyjątków domenowych** dla tego problemu — nie używaj gotowego `IllegalArgumentException`.
* Nazwy klas wyjątków **wymyśl samodzielnie** — dobierz takie, które czytelnie opisują co poszło nie tak (np. osobny przypadek dla pustego/`null` adresu i osobny dla złego formatu). Nazewnictwo jest częścią zadania.
* Zdecyduj, czy mają być `checked` czy `unchecked`, i uzasadnij wybór krótkim komentarzem w kodzie.

**Szkielet:**

```java
import java.util.regex.Pattern;

// TODO: zdefiniuj własne wyjątki domenowe (nazwy wymyśl sam/a)
// np. bazowy wyjątek walidacji + osobne podtypy dla różnych przyczyn błędu

public final class EmailValidator {
    private EmailValidator() {}

    // TODO: zdefiniuj wzorzec, np.:
    // private static final Pattern EMAIL = Pattern.compile("...");

    public static void validate(String email) {
        // TODO: walidacja wg opisu; rzucaj własne wyjątki domenowe z jasnym komunikatem
    }
}
```

**Hint:** nie musisz wymyślać regexa do e-maila od zera — **zalecane** jest poszukanie sprawdzonego wzorca w internecie (np. uproszczony `^[\\w.+\\-]+@[\\w\\-]+\\.[a-zA-Z]{2,}$`) i użycie go w swoim kodzie. To częsta i dobra praktyka w realnych projektach: korzystamy z gotowych, przetestowanych wyrażeń zamiast budować je samodzielnie. Skompiluj wzorzec raz przez `Pattern.compile(...)` i sprawdzaj `pattern.matcher(email).matches()`.
