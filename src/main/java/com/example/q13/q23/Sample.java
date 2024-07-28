package com.example.q13.q23;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {

        int array[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        long count = Stream.of(array)
                .flatMapToInt(n -> IntStream.of(n))
                .map(n -> n * 2)
                .peek(System.out::print)
                .filter(n -> n % 3 == 0)
                .count();
        System.out.println(" " + count);
    }
}
