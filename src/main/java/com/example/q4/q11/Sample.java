package com.example.q4.q11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        IntStream stream = Arrays.stream(array);
        stream.forEach((s) -> System.out.println(s));
    }

}
