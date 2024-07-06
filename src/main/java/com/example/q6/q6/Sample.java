package com.example.q6.q6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{

            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")){
                var sql = "select * from items";
                try(PreparedStatement ps = con.prepareStatement(sql)){
                    // dosomethig
                };
            };

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}