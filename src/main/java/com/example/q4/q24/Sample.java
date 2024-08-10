package com.example.q4.q24;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        Department tokyo = new Department("Tokyo");
        Department osaka = new Department("Osaka");
        List<Employee> list = List.of(
            new Employee("Johnny", tokyo),
            new Employee("Bond", osaka),
            new Employee("Mickey", tokyo),
            new Employee("Sara", osaka)
        );
        
    }

}
