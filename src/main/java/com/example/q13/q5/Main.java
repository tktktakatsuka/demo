package com.example.q13.q5;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Item> list = List.of(
            new Item("apple",100),
            new Item("banana",200),
            new Item("apple",300)
        );

        Double result = list.stream()
        // trueのオブジェクトのみでStreamを生成
        .filter(e -> e.getName().equals("apple"))
        // Item型のpriceでStreamを生成
        .mapToInt(item -> item.getPrice())
        // priceで平均点を生成
        .average()
        // double型で値を取得
        .getAsDouble();

        System.out.println(result);
    }
}
