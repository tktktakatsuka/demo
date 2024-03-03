package com.example.q1.q2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// import文を宣言する必要はある。
import com.example.q1.q2.Item.PriceComparator;

public class Main {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item[] {
                new Item("orange", 100),
                new Item("banana", 80),
                new Item("apple", 120)
        });

        // comparatorインターフェイスを実装したクラスを渡す
        // エンクロージングクラスをnewした後にインナークラスをnewする。
        Collections.sort(items, new PriceComparator());

        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}