package com.example.q13.q2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        String fileName = "resources/test.txt";
        var a = Files.lines(Paths.get(fileName));
        var b = Files.readAllLines(Paths.get(fileName));
        // Stream<String> c = Files.lines(fileName);
        // Stream<String> d = readAllLines(Paths.get(fileName));
    }
}
