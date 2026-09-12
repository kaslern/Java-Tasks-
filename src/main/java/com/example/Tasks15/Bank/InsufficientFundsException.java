package com.example.Tasks15.Bank;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long accountId, long balanceGr, long requestedGr) {
        super("Insufficient funds in account " + accountId + ": balance=" + balanceGr + " gr, requested=" + requestedGr + " gr");
    }
}