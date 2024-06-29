package com.example.q3.q7;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);

        exec.scheduleWithFixedDelay(() -> {
            System.out.println("A");
        }, 1, 1, TimeUnit.SECONDS);

        exec.scheduleWithFixedDelay(() -> {
            System.out.println("B");
        }, 1, 1, TimeUnit.SECONDS);

        int count = 0;
        while (true) {
            // 0.1秒ずつ
            Thread.sleep(100);
            // 1追加される
            count++;
            if (count == 100) {
                exec.shutdown();
                break;
            }

        }
    }
}

