package com.example.Tasks15;

public class CounterTask implements Runnable {

    private final int number;              // numer TEGO wątku – przekazany w konstruktorze

    public CounterTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + number + " start");
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread: " + number + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread stopped");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 5;

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new CounterTask(i + 1));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Program finished");
    }
}