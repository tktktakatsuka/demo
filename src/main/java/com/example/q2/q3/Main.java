package com.example.q2.q3;

import java.util.function.Consumer;

public class Main{
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("hoge");
    }
}
