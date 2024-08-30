package com.murasakiExample.q6.q6;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var stream = Stream.iterate("1", n -> n+1 );
        stream.limit(5).filter(s ->s.length() < 3).forEach(System.out::println);
    }
}
