package com.example.q4.q4;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable(null);
        
        System.out.println(sample.orElse("B"));       
        // 何らかの処理を実行した後に値を戻す場合はorElseGetメソッドを利用する
        System.out.println(sample.orElseGet(() -> {
            return "else";
        }));
    }
}
