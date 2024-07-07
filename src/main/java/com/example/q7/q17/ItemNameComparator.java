package com.example.q7.q17;


import java.util.Comparator;


public class ItemNameComparator implements Comparator<Item> {

    @Override
    public int compare(Item a, Item b) {
        return a.getName().compareTo(b.getName());
    }



}