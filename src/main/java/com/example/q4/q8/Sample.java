package com.example.q4.q8;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<Integer> a = Optional.of(100);
        Optional<Integer> b = a.flatMap(price -> {
            return calc(price, 3);
        });

        System.out.println(b.get());
    }


    private static Optional<Integer> calc(int price, int qty){
        return Optional.of(price * qty);
    }
}
