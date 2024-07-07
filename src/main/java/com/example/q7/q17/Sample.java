package com.example.q7.q17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        Item a = new Item("A", 100);
        Item b = new Item("B", 200);
        Item c = new Item("C", 300);

        List<Item> list = Arrays.asList(a, b, c);

        list.sort(new ItemNameComparator());
        list.forEach(x -> {
            System.out.println(x);
        });

    }

}