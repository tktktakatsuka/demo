package com.example.q13.q10;

public class Sample {
    public static void main(String[] args) {
        try (Test t = new Test()) {
            throw new RuntimeException("B");
            // closeメソッドで起きた例外は抑制される為、Bが表示される
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
