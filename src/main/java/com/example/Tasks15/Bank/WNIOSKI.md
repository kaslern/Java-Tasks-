# Wnioski

1. Wybrałem `ConcurrentHashMap` ze względu na to, że zapewnia bezpieczny, współbieżny dostęp do wielu wątków bez ryzyka uszkodzenia danych oraz poprzez natychmiastowy dostęp po kluczu.
2. Id konta, które jest cechą globalną i unikatową, składa się z liczb naturalnych, więc można je jednoznacznie porównać.
3. `tryLock()` nie czeka na zajęty zamek – jeśli lock się nie udał, to zwalnia konto i ponawia próbę później, przez co nie ma ryzyka zakleszczenia.
4. Atomic gwarantuje niezmienność tylko dla pojedynczej zmiennej, a przelew to operacja złożona, przez co powstaje luka, w której pieniądze mogły zniknąć już z Konta A, ale jeszcze nie trafić na konto B.
5. `Thread.print` po usunięciu zamków na przelewach:

```text
Found one Java-level deadlock:
=============================
"pool-1-thread-1":
  waiting to lock monitor 0x00000260c933da20 (object 0x0000000623aba560, a com.example.Tasks15.Bank.BankAccount),
  which is held by "pool-1-thread-3"

"pool-1-thread-3":
  waiting to lock monitor 0x00000260c933d160 (object 0x0000000623aba410, a com.example.Tasks15.Bank.BankAccount),
  which is held by "pool-1-thread-6"

"pool-1-thread-6":
  waiting to lock monitor 0x00000260c933cc20 (object 0x0000000623aba448, a com.example.Tasks15.Bank.BankAccount),
  which is held by "pool-1-thread-1"