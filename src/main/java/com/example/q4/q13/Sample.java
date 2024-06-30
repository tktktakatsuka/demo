package com.example.q4.q13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {

        List<String> list = List.of("A","B","E","D");
        Stream<String> stream = list.parallelStream();
        // stream.forEach((str) -> System.out.println(str));
        System.out.println("");
        stream.forEachOrdered((str) -> System.out.println(str));
    }

}
