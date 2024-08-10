package com.example.q4.q24;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private Department place;

    public Employee(String name, Department place){
        this.name = name;
        this.place = place;
    }
}
