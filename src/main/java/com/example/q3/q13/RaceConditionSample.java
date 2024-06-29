package com.example.q3.q13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionSample implements Runnable {
    private int num = 100;

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        RaceConditionSample s = new RaceConditionSample();
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(s);
        exec.submit(s);

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        System.out.println(s.num);
        exec.shutdown();
    }

    public synchronized void add(int amount) {
        this.num = this.num + amount;
    }

    @Override
    public void run() {
        add(100);
    }
}
