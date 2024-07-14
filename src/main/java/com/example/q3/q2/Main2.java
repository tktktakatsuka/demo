package com.example.q3.q2;

public class Main2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("sub");
        });
        t.start();
        System.out.println("main");
        
        
        
    }
}
