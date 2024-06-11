package com.example.q2.q7;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> p1 = x -> x > 0;
        Predicate<Integer> p2 = x -> x < 100;
        System.out.println(p1.and(p2).test(100));
    }

}
