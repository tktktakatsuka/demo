package com.example.q13.q8;

public class Main extends AbstractTest implements Test {
    public static void main(String[] args) {
        // interfaceにはデフォルトmethodを定義する。
        // 抽象クラスにはprivateなmethodを定義する。
        // staticメソッドからはインスタンスメソッドを呼び出し不可の為、newしてからexcecuteメソッドを実行する。
        new Main().execute("hello");
    }
}