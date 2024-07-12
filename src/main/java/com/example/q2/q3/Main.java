package com.example.q2.q3;

import java.util.function.Consumer;

public class Main{
    public static void main(String[] args) {
        Consumer<String> consumer =  System.out::println;
        consumer.accept("hoge");
    }
}
