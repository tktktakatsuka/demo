package com.example.q1.q11;

public class Sample implements A, C {

    public static void main(String[] args) {
        Sample main = new Sample();
        main.test();
    }

    @Override
    public void test(){
        System.out.println();
        A.super.test();
        // B.super.test();
        C.super.test();
    }
}
