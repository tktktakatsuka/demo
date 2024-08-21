package com.example.q1.q4;

/**
 * Outer
 */
public class Outer {
    private int num  =2;

    public void hoge(){
        Inner test = new Inner();
        test.data = 100;
        test.execute();
    }
    private static class Inner{
        private int data;
        void execute(){
            System.out.println(data);
        }
    }
}

