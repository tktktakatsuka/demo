package com.example.q7.q12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addFirst("B");
        deque.addLast("C");
        deque.addLast("D");

        deque.stream().forEach((x) -> {
            System.out.println(x);
        });
    }

}