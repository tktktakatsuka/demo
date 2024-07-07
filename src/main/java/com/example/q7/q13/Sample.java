package com.example.q7.q13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
    public static void main(String[] args) throws Exception {
       Set<String> set = new TreeSet<>();
       set.add("B") ;
       set.add("D") ;
       set.add("A") ;
       set.add("C") ;
       set.add("A") ;
       set.forEach(System.out::println);
    }

}