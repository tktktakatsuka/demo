package com.example.q4.q17;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = 20;
        int primitiveInt = boxedInt; // 自動アンボクシング
        System.out.println("Primitive int: " + primitiveInt);
    }
}
