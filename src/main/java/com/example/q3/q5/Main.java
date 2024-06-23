package com.example.q3.q5;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{

        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();

        exec.scheduleAtFixedRate(() ->{
            int r = new Random().nextInt(10);
            System.out.print(r);
            try{
                Thread.sleep(r * 100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("interrupt");
        }
            , 1, 1, TimeUnit.SECONDS);

            int count = 0;
            while (true) {
                Thread.sleep(100);
                System.out.print(">");
                count++;
                if(count == 100){
                    exec.shutdown();
                    break;
                }
                
            }
    }
}
