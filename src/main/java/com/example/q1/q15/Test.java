package com.example.q1.q15;

import java.util.Map;

public class Test{
    public static void main(String[] args) {
        var a = Map.entry(1, "A");
        var b = Map.entry(2, "B");
        var c = Map.entry(3, "C");

        Map<Integer, String> map = Map.ofEntries(a, b, c);
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
    
}