package com.example.q1.q11;

public interface D extends C {
    default void test(){
        System.out.println("D");
    }

}