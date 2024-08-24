package com.murasakiExample.q1.q3;

public class Test {
    enum Vals {
        X, Y, Z
    };

    public static void main(String[] args) {
        System.out.println(Vals.X.ordinal());
        System.out.println(Vals.Y.ordinal());

        Vals data = Vals.X;
        switch (data) {
            case X:
                System.out.println("x");
                break;
            case Y:
                System.out.println("y");
                break;
            case Z:
                System.out.println("z");
                break;
        }
    }

}
