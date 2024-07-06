package com.example.q6.q7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")){
                var sql = "delete from item where id = ?";
                try(PreparedStatement ps = con.prepareStatement(sql)){
                    // dosomethig
                    ps.setInt(1, 1);
                    ps.executeUpdate();
                };
            };
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}