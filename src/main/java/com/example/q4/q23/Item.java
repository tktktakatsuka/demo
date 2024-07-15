package com.example.q4.q23;


public class Item {
    private int id;
    private ItemType type;
    private String name;
    private int price;

    public Item(int id, ItemType type, String name, int price){
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }

    public ItemType getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return id + "" + type + name + "" + price;
    }

}
