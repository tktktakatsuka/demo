package com.example.q1.q5;

public class Outer {

    void test(){
        Inner.message = "hello java";
    }
    
    // innerクラスのmethodの呼び出し。
    static class Inner{
        private static String message;
        public void test(){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        new Outer().test();
        new Inner().test();
    }
}
