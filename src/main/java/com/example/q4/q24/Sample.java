package com.example.q4.q24;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<Department, List<Employee>> result = 
        list.stream().collect(Collectors.groupingBy(Employee::getDept));
        
    }

}
