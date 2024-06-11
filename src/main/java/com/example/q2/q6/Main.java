package com.example.q2.q6;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = x -> x.isEmpty();
        System.out.println(p1.test("null"));
    }
}
