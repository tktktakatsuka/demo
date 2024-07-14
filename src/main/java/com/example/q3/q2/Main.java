package com.example.q3.q2;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("sub");
            }
            
        }); 

        t.start();
        System.out.println("main");
        
        
        
    }
}
