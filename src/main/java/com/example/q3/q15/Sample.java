package com.example.q3.q15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Value val = new AtomicValue();

        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(new Task(val));
        exec.submit(new Task(val));

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println(val.get());
        exec.shutdown();
    }

}
