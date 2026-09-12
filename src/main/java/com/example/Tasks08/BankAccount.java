package com.example.Tasks08;

final class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Balance is too low");
        }
        balance -= amount;

        // TODO: gdy amount > balance -> throw new InsufficientFundsException(...)
        // w p.p. zmniejsz balance
    }
}
