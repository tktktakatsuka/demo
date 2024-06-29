package com.example.q3.q9;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future future = exec.submit(() -> {
            try {
                System.out.println("start");
                Thread.sleep(2000);
                System.out.println("end");
            } catch (final Exception e) {
                throw new RuntimeException(e);
            }
        },"finish");

        if (future.get() == "finish") {
            System.out.println("finish");
        }

    }
}
