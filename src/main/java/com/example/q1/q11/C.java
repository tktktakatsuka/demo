package com.example.q1.q11;

public interface C extends B {
    default void test(){
        System.out.println("C");
    }

}