package com.example.q6.q3;

import java.io.File;
import java.io.FileFilter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{

            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample");
            System.out.println(conn);
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}