package com.example.q4.q7;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable(null);
        Optional<String> result = sample.map(str -> {
            return str.toUpperCase();
        });

        System.out.println(sample.get());
        System.out.println(result.get());
    }
}
