package com.example.q4.q5;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) throws Exception {

        Optional<String> sample = Optional.ofNullable(null);
        sample.ifPresent((str) -> System.out.println(str));
        
    }
}
