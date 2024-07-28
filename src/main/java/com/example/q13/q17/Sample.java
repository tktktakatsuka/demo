package com.example.q13.q17;

import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Item> items = List.of(
                new Item("A", 100),
                new Item("B", 200),
                new Item("C", 300));

        // Streamを生成する際には型パラメータを指定する。指定しない場合はObjectクラスとして扱われる
        Stream<Item> itemStream = items.stream();
        itemStream.filter(item -> ((Item) item).getPrice() > 100)
                .mapToInt(item -> ((Item)item).getPrice())
                .forEach(System.out::println);
    }
}
