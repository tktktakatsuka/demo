package com.example.q13.q12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Sample {

    // フィールドはAtomicInteger型で定義する。
    private AtomicInteger num = new AtomicInteger(100);
    private int num2 = 100;

    public static void main(String[] args) {
        Sample s = new Sample();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                for (int j = 0; j < 10000; j++) {
                    // スレッドセーフにするためにsynchronized修飾子で囲う（指定するのはインスタンス自体）
                    synchronized (s){
                        s.num2++;
                    }
                    // AtomicInteger型の変数を定義し、インクリメントするmethodを呼びだす。
                    s.num.incrementAndGet();
                    System.out.println(s.num);
                }
            });
        }
        service.shutdown();
    }
}
