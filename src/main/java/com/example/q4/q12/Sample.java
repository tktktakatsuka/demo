package com.example.q4.q12;

import java.util.HashSet;

import java.util.Set;

import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {

        Set<String> list = new HashSet<String>();
        list.add("D");
        list.add("A");
        list.add("B");
        Stream<String> stream = list.stream();
        stream.forEach((str) -> System.out.println(str));
    }

}
