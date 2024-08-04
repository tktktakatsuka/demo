package com.example.q4.q8;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<Integer> a = Optional.of(100);

        // オプショナルクラスのマップmethodを利用
        Optional<Integer> b = a.map(price -> {
            return calc(price, 3);
        });

        // オプショナルを戻す場合は、flatmapメソッドを利用。
        Optional<Integer> c = a.flatMap(price -> {
            return optionalCalc(price, 3);
        });

        System.out.println(b.get());
        System.out.println(c.get());
    }

    // 値を戻すメソッド→ mapメソッドを利用
    private static Integer calc(int price, int qty) {
        return price * qty;
    }

    // オプショナルクラスを戻すメソッド→ フラットマップメソッドを利用
    private static Optional<Integer> optionalCalc(int price, int qty) {
        return Optional.of(price * qty);
    }
}
