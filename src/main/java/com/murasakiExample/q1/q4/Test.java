package com.murasakiExample.q1.q4;

public class Test {
    enum Vals {
        X{ int method(){ return 1;}},
        Y{ int method(){ return 2;}},
        Z{ int method(){ return 3;}};
        abstract int method();
    };

    public static void main(String[] args) {
        System.out.println(Vals.Y);
        System.out.println(Vals.Y.method());
    }

}
