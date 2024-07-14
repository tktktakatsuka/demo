package com.example.q3.q3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            exec.submit(() -> {
                System.out.println(Thread.currentThread().getId());
            });
        }
    }
}
