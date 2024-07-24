package com.example.q8.q4;


public class Item {
    @NotNull(message = "name is not alloowed null")
    private String name;
    private int price;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}