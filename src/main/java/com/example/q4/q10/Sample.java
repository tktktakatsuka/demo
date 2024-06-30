package com.example.q4.q10;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3,4,5);
        Stream<Integer> stream = a.stream();
        stream.forEach((s) -> System.out.println(s));
    }

}
