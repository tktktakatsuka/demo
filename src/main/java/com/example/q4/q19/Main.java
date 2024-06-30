package com.example.q4.q19;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int result = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
