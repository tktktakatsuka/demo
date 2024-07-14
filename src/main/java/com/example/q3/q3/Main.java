package com.example.q3.q3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.submit(() -> {
                System.out.println(Thread.currentThread().getId());
            });
        }
    }
}
