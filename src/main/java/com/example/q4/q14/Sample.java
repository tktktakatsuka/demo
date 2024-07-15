package com.example.q4.q14;

import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        // stream.forEach((str) -> System.out.println(str));
        System.out.println("");
        stream
                .filter(n -> n > 5)
                .forEach((num) -> System.out.println(num));
    }

}
