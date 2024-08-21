package com.example.q10.q1;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("ja", "JP", "JP");
        System.out.println(locale.toLanguageTag());
    }
}
