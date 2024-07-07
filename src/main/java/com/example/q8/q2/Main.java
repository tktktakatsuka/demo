package com.example.q8.q2;

public class Main {

    public static void main(String[] args) {

        Class<Item> obj = Item.class;
        if(obj.isAnnotationPresent(Test.class)){
            Test test = obj.getAnnotation(Test.class);
            System.out.println(test.price());
        }

    }

}