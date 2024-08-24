package com.murasakiExample.q1.q9;

/**
 * Test
 */
interface Test {

    int number = 100;

    // public static String method();
    public String method();

    default public int foo() {
        return 0;
    }
}

