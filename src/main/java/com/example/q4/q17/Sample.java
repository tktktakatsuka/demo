package com.example.q4.q17;

import java.util.List;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 7, 2, 1);
        list.stream()
                .sorted((a, b) -> {
                    if (a < b) {
                        return -1;
                    }
                    if (b > a) {
                        return 1;
                    }
                    return 0;
                })
                .forEach(System.out::println);
    }
}
