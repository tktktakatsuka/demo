package com.example.q1.q3;

/**
 * Outer
 */
public class Outer {
    private String message = "hello java";

    // static領域からはインスタンスへアクセスすることができないため、
    // static 修飾子を付与するとコンパイルエラーになる
    class Inner {
        public void test(){
            System.out.println(message);
        }
    }

    
}