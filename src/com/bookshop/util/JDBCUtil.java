package com.bookshop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil { //数据库连接工具类

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/bookshop?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String USER = "root"; //数据库用户名，默认为root
    static final String PASS = "760421"; //数据库密码，需自行修改
    static Connection conn = null;

    public static Connection getCon(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

        } catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(ResultSet rs,Connection conn,PreparedStatement pstm){
        try{
            if (rs!=null){
                rs.close();
            }
            if (pstm!=null){
                pstm.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void close(Connection conn,PreparedStatement pstm){
        try{
            if (pstm!=null){
                pstm.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}