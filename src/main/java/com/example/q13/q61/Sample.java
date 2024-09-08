package com.example.q13.q61;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
    public static void main(String[] args) throws IOException{

        Path src  = Paths.get("resources/test.txt");
        Path dest = Paths.get("resources");
        Files.move(src, dest);
    }
}
