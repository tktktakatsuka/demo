package com.example.q1.q7;

public class Main{
    public static void main(String[] args) {
        var sample = new Sample(10){
            void modify(int num){
                setNum(num);
            }
        };
        sample.modify(10);
        System.out.println(sample.getNum());
    }
}
