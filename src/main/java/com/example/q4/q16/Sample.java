package com.example.q4.q16;

import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {

        List<Integer> list = List.of(5, 7, 4, 2, 1);
        Stream<Integer> stream = list.parallelStream();
        // stream.forEach((str) -> System.out.println(str));
        System.out.println("");
        stream

                .findAny()
                .ifPresent((str) -> System.out.println(str));

    }

}
