package com.example.q4.q24;


public class Department {
    private String name;
    private int price;

    public Department(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
        
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Department){
            Department other = (Department)obj;
            return this.name.equals(other.name);
        }
        return false;
    }


}
