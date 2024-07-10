package com.example.q1.q8;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                super.add("A");
                super.add("B");
                super.add("C");
            }
        };
        list.stream().forEach((x) -> {
            System.out.println(x);
        });
    }
}
