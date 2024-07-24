package com.example.q8.q2;

@Test(name = "test", getPrice = 100)
public class Item implements Comparable<Item> {

    public void display() {
        System.out.println();
        System.out.println("Inside SampleClass");
    }

    @Override
    public int compareTo(Item o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


}