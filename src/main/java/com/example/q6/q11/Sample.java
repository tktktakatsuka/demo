package com.example.q6.q11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")){
                var sql = "select id, name from item";
                try(PreparedStatement ps = con.prepareStatement(sql)){
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        System.out.print(rs.getInt(1) + ":");
                        System.out.println(rs.getString("name"));
                    }
                    // dosomethig
                };
            };
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}