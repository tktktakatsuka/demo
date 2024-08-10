package com.example.q4.q16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {

        String[] array = {"A", "B", "C"};
        Stream<String> stream = Arrays.stream(array);
        Optional<String> result = stream.findAny();
        result.ifPresent(System.out::println);



        // List<Integer> list = List.of(5, 7, 4, 2, 1);
        // Stream<Integer> stream2 = list.parallelStream();
        // // stream.forEach((str) -> System.out.println(str));
        // System.out.println("");
        // stream
        //         .findAny()
        //         .ifPresent((str) -> System.out.println(str));

    }

}
