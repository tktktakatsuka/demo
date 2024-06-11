package com.example.q2.q12;

import java.util.function.UnaryOperator;

public class Sample {
    public static void main(String[] args) {
        UnaryOperator <Integer> u1 = x -> x + 2;
        UnaryOperator <Integer> u2 = x -> x * 2;
        
        System.out.println(u1.compose(u2).apply(10));
    }
}
