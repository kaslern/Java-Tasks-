package com.example.Tasks15.Bank;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(8);
        Random random = new Random(42);
        Bank bank = new Bank();

        for (int i = 0; i < 10; i++) {
            int id = i;
            bank.openAccount(id, 1000);
        }

        CompletableFuture<?>[] tasks = new CompletableFuture<?>[1000];

        for (int i = 0; i < 1000; i++) {
            int from = random.nextInt(10);
            int to = random.nextInt(10);

            while (to == from) {
                to = random.nextInt(10);
            }
            long amountGr = (100 + random.nextInt(401)) * 100L;

            final int fromId = from;
            final int toId = to;
            final long amount = amountGr;

            tasks[i] = CompletableFuture.runAsync(() -> {
                try {
                    bank.transfer(fromId, toId, amount);
                } catch (InsufficientFundsException e) {

                }
            }, pool);
        }
        CompletableFuture.allOf(tasks).join();
        pool.shutdown();

        long expected = 10 * 1000 * 100L;
        long actual = bank.totalBalanceGr();

        System.out.println("Łączny stan kasy w banku: " + actual + " gr");

        if (actual != expected) {
            throw new AssertionError("NIEZMIENNIK ZŁAMANY – bilans się nie zgadza!");
        } else {
            System.out.println("Sukces! Wszystkie przelewy wykonane, bilans banku jest nienaruszony.");
        }
    }
}
