package com.example.q2.q9;

import java.util.function.Function;

public class Sample {
    public static void main(String[] args) {
        Function<String,Integer> f = x-> x.length();
        System.out.println(f.apply("hoge"));
    }
}
