package com.example.q4.q23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsSample {
    public static void main(String[] args) {

        List<Item> list = Arrays.asList(
                new Item(1, ItemType.BOOK, "java", 1111),
                new Item(2, ItemType.BOOK, "lambda", 2222),
                new Item(3, ItemType.MAGAZINE, "magazine", 1980),
                new Item(4, ItemType.MAGAZINE, "test", 1980));

        Map<Integer, Item> books = list.stream()
                .filter(item -> item.getType() == ItemType.BOOK)
                .collect(Collectors.toMap(
                    item-> item.getId(), item->item
                ));
        books.keySet().stream().forEach(System.out::println);
    }

}
