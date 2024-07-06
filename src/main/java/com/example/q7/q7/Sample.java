package com.example.q7.q7;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        Test<?> test = new Test<>("Hello");
        // 非境界ワイルドカードの戻り値はobject型になる
        // test.setVal(null);
        String msg = (String)test.getVal();

    }
}