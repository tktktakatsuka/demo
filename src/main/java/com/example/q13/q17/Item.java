package com.example.q13.q17;

import java.util.Comparator;

public class Item implements Comparable<Item> {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(Item target) {
        return name.compareTo(target.name);
    }


    // itemクラスの中にpriceComparatorクラスを記述する
    public static class PriceComparator implements Comparator<Item>{
        @Override
        public int compare(Item a, Item b){
            if(a.price < b.price){
                return -1;
            }
            if(b.price < a.price){
                return 1;
            }
            return 0;
        }
    }

}