package com.example.q4.q2;

import java.util.Optional;

public class OfTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable(null);
        // Optional<String> sample = Optional.ofNullable("null");
        System.out.println(sample.get());
    }
    
}
