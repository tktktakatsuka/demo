package com.example.q13.q21;

import java.util.List;
import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        var list = List.of("apple", "banana", "orange", "melon");
        Optional<String> result = list.stream()
                .filter(x -> x.contains("z"))
                .reduce((i, j) -> i + " " + j);

        result.ifPresent(System.out::print);
    }
}
