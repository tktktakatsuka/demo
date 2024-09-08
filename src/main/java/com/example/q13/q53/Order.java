package com.example.q13.q53;

import lombok.Data;

@Data
public class Order{
    private String item;
    private int price;
    public Order(String item, int price){
        super();
        this.item = item;
        this.price = price;
    }


}
