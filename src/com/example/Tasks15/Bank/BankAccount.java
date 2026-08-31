package com.example.Tasks15.Bank;

public class BankAccount {

    private final Long accountId;
    private long balanceGrosz;                 // saldo w GROSZACH

    public BankAccount(Long id, long initialPln) {
        this.accountId = id;
        this.balanceGrosz = initialPln * 100;
    }

    public synchronized void deposit(long amountToDepositInGrosze) {
        if (amountToDepositInGrosze <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balanceGrosz += amountToDepositInGrosze;
    }

    public synchronized void withdraw(long amountToWithdrawInGrosze) {
        if (amountToWithdrawInGrosze <= 0) {
            throw new IllegalArgumentException("Ammount cannot be negative");
        }

        if (amountToWithdrawInGrosze > balanceGrosz) {
            throw new InsufficientFundsException(accountId, balanceGrosz, amountToWithdrawInGrosze);
        }
        balanceGrosz -= amountToWithdrawInGrosze;
    }

    public synchronized long getBalanceGr() {
        return balanceGrosz;
    }

    public Long getId() {
        return accountId;                          // pole final – synchronizacja niepotrzebna
    }
}