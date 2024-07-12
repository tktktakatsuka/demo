package com.example.q2.q10;

import java.util.function.Function;

public class Sample {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = x -> x + 2;
        Function<Integer, Integer> f2 = x -> x * 2;
        System.out.println(f1.compose(f2).apply(10));
        System.out.println(f1.andThen(f2).apply(10));
    }
}
