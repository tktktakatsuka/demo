package com.example.q13.q1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //　インプットストリームリーダーをバッファドリーダに格納する
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("in : ");
            String input = br.readLine();
            System.out.println("out : " + input);

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
