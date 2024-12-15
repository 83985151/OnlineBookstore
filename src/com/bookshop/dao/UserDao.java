package com.bookshop.dao;

import com.bookshop.bean.User;
import com.bookshop.util.JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/bookshop?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "760421";

    public static User login(String username, String password) {
        User login = new User();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pstm = null;
        try{

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            String sql = "select * from user_list where username=? and password=?" ;

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,username);
            pstm.setObject(2,password);

            rs = pstm.executeQuery();

            if (rs.next()){
                login.setUid(rs.getInt("uid"));
                login.setUsername(rs.getString("username"));
                login.setPassword(rs.getString("password"));
                login.setUserkind(rs.getString("userkind"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return login;
    }
}

