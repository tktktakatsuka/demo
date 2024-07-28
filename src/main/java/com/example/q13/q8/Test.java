package com.example.q13.q8;

public interface Test {
    public default void execute(String str) {
        System.out.println("A");
    }
}