package com.example.q3.q12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // 5つのスレッドを生成する
        ExecutorService exec = Executors.newFixedThreadPool(5);

        CyclicBarrier barrier = new CyclicBarrier(5, () -> {
            System.out.println("its all done");
        });

        for (int i = 0; i < 5; i++) {
            exec.submit(new Task(barrier));
        }

    }
}
