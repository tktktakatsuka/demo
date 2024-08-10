package com.example.q4.q9;

import java.util.List;

public class Sample {
    public static void main(String[] args) {
        // Java 9以降で利用可能なList.of()メソッドを使用してリストを作成
        List<Integer> list = List.of(1, 2, 3, 4);
        
        list.forEach(System.out::println);
    }
}