package com.example.q3.q12;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        super();
        this.barrier = barrier;
    }

    @Override
    public void run() {
        long id = Thread.currentThread().getId();

        int r = new Random().nextInt(10);
        try {
            Thread.sleep(r * 100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End:" + id);

        try {
            this.barrier.await();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
