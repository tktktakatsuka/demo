package com.murasakiExample.q2.q1;


public class Main implements Test<String>{
    public static void main(String[] args) {
        new Main().Task("仕事");
        new Main().equals();
    }
    
    @Override
    public void Task(String t) {
        System.out.println(t);
    }
}