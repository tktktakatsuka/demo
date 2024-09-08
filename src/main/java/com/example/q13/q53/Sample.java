package com.example.q13.q53;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Sample {
    public static void main(String[] args) {
        List<Order> list = List.of(new Order("apple", 100),
                new Order("banana", 80));

        IntBinaryOperator op = (a, b) -> a + b;
        int total = list.stream()
                .mapToInt(o -> o.getPrice() * 10)
                .reduce(0, op);
                // .reduce(0, op);
    }
}
