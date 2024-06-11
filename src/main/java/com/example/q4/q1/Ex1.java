package com.example.q4.q1;

import java.util.Optional;

public class Ex1{
    public static void main(String[] args){
        // オプショナル.ofはnullを許容しない
        // Optional<String> sample = Optional.of(null);
        // オプショナル.ofはnullを許容すうる
        Optional<String> sample2 = Optional.ofNullable(null);
        System.out.println(sample2);
    }
}