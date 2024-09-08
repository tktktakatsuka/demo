package com.example.q4.q27;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana","apple","orange");
        Stream<String> stream = list.stream();
        stream.filter(str -> str.length() > 5)
        .peek(t -> System.out.print(t + " "))
        .map(t -> t.toUpperCase())
        .peek(t -> System.out.print(t + " "))
        .forEach(System.out::print);

    }

}
