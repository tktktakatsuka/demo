package com.example.q6.q9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {
    public static void main(String[] args) throws Exception {
        try{
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")){
                var selectSql = "select * from item";
                try(PreparedStatement ps = con.prepareStatement(selectSql)){
                    ResultSet result = ps.executeQuery();
                    System.out.println(result );
                    result.next();
                    System.out.println(result.getString(1));
                    System.out.println(result.getString(2));
                    // dosomethig
                };
                
                Integer i = Integer.valueOf("123");
                // var updateSql = "insert into item values(?,?)";
                // try(PreparedStatement ps = con.prepareStatement(updateSql)){
                //     ps.setInt(1, 4);
                //     ps.setString(2, "hoge");
                //     int result = ps.executeUpdate();
                //     System.out.println(result + "件挿入しました。");
                //     // dosomethig
                // };
            };
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}