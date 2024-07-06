package com.example.q7.q6;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {

        List<Integer> iList = List.of(1,2,3,4,5);
        List<String> sList  = List.of("A","B","C");
        printAll(iList);
        printAll(sList);

    }

    public static void printAll(List<?> list){
        list.forEach((x) -> {System.out.println(x);});
    }

}