package com.example.q6.q8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")){
                var sql = "select * from item where id = ?";
                try(PreparedStatement ps = con.prepareStatement(sql)){
                    ResultSet rs = ps.executeQuery();
                    // dosomethig
                };
            };
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}