package com.example.q4.q20;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Optional<Integer> result = list.stream().max((a, b) -> a.compareTo(b));
        System.out.println(result);
    }
}
