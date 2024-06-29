package com.example.q4.q6;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable(null);
        sample.ifPresentOrElse((str) -> {
            System.out.println(str);
        },
                () -> {
                    System.out.println("empty");
                });
    }
}
