package com.example.q5.q3;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws Exception{
        FileReader reader = null;
        try{
            reader = new FileReader("sample.txt");
            int i = 0;

            while ( (i = reader.read()) != -1) {
                char c = (char)i;
                System.out.println(c);
            }

        }finally{
            if(reader != null){
                reader.close();
            }
        }
    }
}