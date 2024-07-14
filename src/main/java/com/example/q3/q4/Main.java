package com.example.q3.q4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.schedule(() -> {
            System.out.println("finish");
            exec.shutdown();
        },1,TimeUnit.SECONDS);

        int count = 0;
        while (true) {
            Thread.sleep(100);
            if(exec.isShutdown()){
                break;
            }
            System.out.println(++count * 100 +"ms");
        }

    }
}
