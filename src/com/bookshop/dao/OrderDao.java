package com.bookshop.dao;

import com.bookshop.bean.Order;
import com.bookshop.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pstm = null;
    List<Order> orderList = new ArrayList<>();
    int row = 0;

    public List<Order> selectAllOrder() {
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from order_list";

            pstm = con.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Order order = new Order();
                order.setOid(rs.getInt("oid"));
                order.setBookname(rs.getString("bookname"));
                order.setPrice(rs.getDouble("price"));
                order.setUsername(rs.getString("username"));
                order.setPayment(rs.getString("payment"));
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }

        return orderList;
    }
    public List<Order> selectUserOrder(int uid) {
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from order_list where uid = ?";

            pstm = con.prepareStatement(sql);
            pstm.setObject(1,uid);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Order order = new Order();
                order.setOid(rs.getInt("oid"));
                order.setBookname(rs.getString("bookname"));
                order.setPrice(rs.getDouble("price"));
                order.setUsername(rs.getString("username"));
                order.setPayment(rs.getString("payment"));
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }

        return orderList;
    }
    public Order findOrderById(int oid){
        Order order = new Order();
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from order_list where oid=?";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,oid);

            rs = pstm.executeQuery();

            while (rs.next()) {
                order.setOid(rs.getInt("oid"));
                order.setBookname(rs.getString("bookname"));
                order.setPrice(rs.getDouble("price"));
                order.setUsername(rs.getString("username"));
                order.setPayment(rs.getString("payment"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }

        return order;
    }
    public int delOrder(int oid){
        try {
            con = JDBCUtil.getCon();

            String sql = "delete from order_list where oid=?";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,oid);

            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con, pstm);
        }
        return row;
    }
    public int payOrder(int oid){
        try {
            con = JDBCUtil.getCon();

            String sql = "update order_list set payment='已付款' WHERE oid = ?";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,oid);

            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con, pstm);
        }
        return row;
    }
    public List<Order> seachOrderByUsername(String keyword){
        List<Order> orderList = new ArrayList<>();
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from order_list where username like concat('%',?,'%')";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,keyword);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Order order = new Order();
                order.setOid(rs.getInt("oid"));
                order.setBookname(rs.getString("bookname"));
                order.setPrice(rs.getDouble("price"));
                order.setUsername(rs.getString("username"));
                order.setPayment(rs.getString("payment"));
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }
        return orderList;
    }
    public List<Order> seachOrderByBookname(String keyword){
        List<Order> orderList = new ArrayList<>();
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from order_list where bookname like concat('%',?,'%')";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,keyword);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Order order = new Order();
                order.setOid(rs.getInt("oid"));
                order.setBookname(rs.getString("bookname"));
                order.setPrice(rs.getDouble("price"));
                order.setUsername(rs.getString("username"));
                order.setPayment(rs.getString("payment"));
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }
        return orderList;
    }
    public int addOrder(Order order){
        try {
            con = JDBCUtil.getCon();

            String sql = "insert into order_list(bookname,price,username,payment,uid) values(?,?,?,?,?)";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,order.getBookname());
            pstm.setObject(2,order.getPrice());
            pstm.setObject(3,order.getUsername());
            pstm.setObject(4,order.getPayment());
            pstm.setObject(5,order.getUid());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con, pstm);
        }
        return row;
    }
}
