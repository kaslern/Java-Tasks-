package com.example.Tasks15;

import java.util.Random;

public class ParallelSum {

    private static final int SIZE = 1_000_000;
    private static final int PARTS = 4;

    /**
     * Zadanie liczące sumę fragmentu [from, to) i zapisujące ją pod swój indeks.
     */
    static class PartialSumTask implements Runnable {
        private final int[] data;
        private final int from;             // włącznie
        private final int to;               // wyłącznie
        private final long[] results;       // WSPÓLNA tablica wyników
        private final int index;            // MÓJ i tylko mój indeks w results

        public PartialSumTask(int[] data, int from, int to, long[] results, int index) {
            this.data = data;
            this.from = from;
            this.to = to;
            this.results = results;
            this.index = index;
        }

        @Override
        public void run() {
            long partialSum = 0;
            for (int i = from; i < to; i++) {
                partialSum += data[i];
            }
            results[index] = partialSum;
        }
    }

    static long sequentialSum(int[] data) {
        long sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[PARTS];
        long[] results = new long[PARTS];
        int[] data = new int[SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            data[i] = random.nextInt(100);
        }

        int pieceOfNumber = SIZE / PARTS; // 1 000 000 / 4 = 250 000

        for (int i = 0; i < PARTS; i++) {
            int from = i * pieceOfNumber;
            int to = (i + 1) * pieceOfNumber;
            System.out.println("Fragment " + i + ": range [" + from + ", " + to + ")");
            threads[i] = new Thread(new PartialSumTask(data, from, to, results, i));
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        long parallelSum = 0;
        for (long res : results) {
            parallelSum += res;
        }

        long seqSum = sequentialSum(data);

        System.out.println("Parallel sum:   " + parallelSum);
        System.out.println("Sequential sum: " + seqSum);
        System.out.println("Results are equals " + (parallelSum == seqSum));

    }
}