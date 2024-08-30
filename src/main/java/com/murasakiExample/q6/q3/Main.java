package com.murasakiExample.q6.q3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, null);
        map.put(3, 30);

        map.merge(1, 3, (a, b) -> {
            return a + b;
        });
        map.merge(3, 3, (a, b) -> {
            return a + b;
        });

        System.out.println(map);
    }
}
