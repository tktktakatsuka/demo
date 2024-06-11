package com.example.q2.q5;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        // BiConsumer<String, Integer> bi = (k, v) -> map.put(k, v);
        BiConsumer<String, Integer> bi = map::put;
        bi.accept("key1", 1);

        System.out.println(map.get("key1"));

    }
}
