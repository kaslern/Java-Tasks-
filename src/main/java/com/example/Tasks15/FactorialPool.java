package com.example.Tasks15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class FactorialPool {

    private static final int POOL_SIZE = 4;
    private static final int MAX_N = 20;

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(100, 501));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
        List<Future<BigInteger>> futures = new ArrayList<>();

        for (int n = 1; n <= MAX_N; n++) {
            final int currentN = n;
            Future<BigInteger> ticket = pool.submit(() -> factorial(currentN));
            futures.add(ticket);
        }

        for (int i = 0; i < futures.size(); i++) {
            int n = i + 1;
            BigInteger result = futures.get(i).get();
            System.out.println(n + " -> " + result);
        }

        pool.shutdown();
    }
}