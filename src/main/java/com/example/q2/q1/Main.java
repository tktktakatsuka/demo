package com.example.q2.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Supplier型引数をわたさない。getメソッドを利用することでインスタンスを取得することができる
        Supplier<List<String>> supplier = () -> new ArrayList();
        List<String> list = supplier.get();
        // do something
        list.add("hoge");

        // listから値を取得するのはgetメソッドを利用する。
        System.out.println(list.get(0));
    }
}
