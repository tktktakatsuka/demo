package com.example.q4.q24;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private Department dept;

    public Employee(String name, Department place){
        this.name = name;
        this.dept = place;
    }
}
