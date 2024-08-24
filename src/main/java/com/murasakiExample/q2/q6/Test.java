package com.murasakiExample.q2.q6;

import java.util.List;

public class Test {
    @SafeVarargs
    static void foo(List<Double>... list){
        System.out.println(list);
    }
    
}
