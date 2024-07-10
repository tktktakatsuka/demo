package com.example.q1.q10;

public class SampleImpl implements Sample {
    public static void main(String[] args) {
        System.out.println();
        Sample.testA();
        testA();
    }

    public static void testA() {
        System.out.println("B");
    }

    @Override
    public void testB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testB'");
    }
}
