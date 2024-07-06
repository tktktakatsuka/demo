package com.example.q7.q3;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        // 変数への代入
        List<String> list = new ArrayList<>();
        // メソッドの引数
        execute(new ArrayList<>());

    }

    private static void execute(List<String> list){
        // dosomething
    }

    private static List<String> test(){
        // 戻り値
        return new ArrayList<>();
    }
}