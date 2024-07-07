package com.example.q7.q17;

public class Item implements Comparable<Item> {

    private String name;
    private int price;

    public Item(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Item other) {
        if (this.price < other.price) {
            return -1;
        }
        if (this.price > other.price) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + "" + price;
    }

}