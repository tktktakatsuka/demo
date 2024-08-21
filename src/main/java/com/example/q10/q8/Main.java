package com.example.q10.q8;

import java.io.FileReader;

import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        prop.load(new FileReader("db_settings.properties"));
        prop.list(System.out);
    }
}
