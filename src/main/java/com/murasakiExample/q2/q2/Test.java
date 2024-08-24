package com.murasakiExample.q2.q2;

import java.util.HashSet;
import java.util.Set;

public class Test{
    public static void main(String[] args) {
        System.out.println(getData());
    }

    @SuppressWarnings("unchecked")
    public static Set getData(){
        Set set = new HashSet();
        set.add(10);
        set.add(20);
        return set;
    }
}