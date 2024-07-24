package com.example.q8.q4;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Item item = new Item(null, 1);
        List<String> messages = NotNullValidator.validate(item);
        if(messages.isEmpty()){
            System.out.println("valid object");
            return;
        }

        for(String message : messages){
            System.out.println(message);
        }

    }

}