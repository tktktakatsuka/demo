package com.example.q6.q11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")){
                var sql = "insert into item values(?,?)";
                try(PreparedStatement ps = con.prepareStatement(sql)){
                    ps.setInt(1, 1);
                    ps.setString(2, "hoge");
                    int result = ps.executeUpdate();
                    System.out.println(result + "件挿入しました。");
                    // dosomethig
                };
            };
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}