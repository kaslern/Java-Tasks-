package com.example.Tasks15.Bank;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Bank {

    private final Map<Long, BankAccount> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialPln) {
        accounts.put(id, new BankAccount(id, initialPln));
    }


    public void transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) {
            throw new IllegalArgumentException("Cannot transfer from same account to the same account");
        }

        BankAccount from = accounts.get(fromId);
        BankAccount to = accounts.get(toId);



        BankAccount firstLock = (fromId < toId) ? from : to;
        BankAccount secondLock = (fromId < toId) ? to : from;

        synchronized (firstLock) {
            synchronized (secondLock) {
                from.withdraw(amountGr);
                to.deposit(amountGr);
            }
        }
    }

    public long totalBalanceGr() {
        long total = 0;
        for (BankAccount account : accounts.values()) {
            total += account.getBalanceGr();
        }
        return total;
    }
}
