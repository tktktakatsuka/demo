package com.example.q1.q16;

public enum Sample {
    A("hello"), B("hello"), C("hello");

    private final String value;

    private Sample(String value) {
        System.out.println(value);
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}