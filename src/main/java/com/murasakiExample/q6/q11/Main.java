package com.murasakiExample.q6.q11;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        LongStream stream = LongStream.of(1, 2, 3);
        OptionalLong op = stream.map(n -> n * 2)
                .filter(n -> n < 5)
                .findFirst();
        if (op.isPresent()) {
            System.out.println(op.getAsLong());
        }

        op.ifPresent((x) -> {
            System.out.println(x);
        });
    }
}
