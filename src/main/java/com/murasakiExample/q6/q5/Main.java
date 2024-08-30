package com.murasakiExample.q6.q5;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Predicate<? super String > p = s -> s.length() < 5;
        Stream<String> stream = Stream.generate(() -> "orange");
        System.out.println(stream.anyMatch(p) + " ");
    }
}
