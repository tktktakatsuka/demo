package com.example.q7.q14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.entrySet()
        .stream()
        .forEach((Map.Entry<String, Integer> entry) -> {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ":"+val);
        });
        
        
    }

}