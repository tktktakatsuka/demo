package com.example.q4.q4;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) throws Exception {
        try {
            Optional<String> sample = Optional.empty();

            System.out.println(
                    sample.orElseThrow(() -> new Exception()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
