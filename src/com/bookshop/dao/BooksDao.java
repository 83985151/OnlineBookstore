package com.bookshop.dao;

import com.bookshop.bean.Books;
import com.bookshop.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BooksDao {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pstm = null;
    List<Books> booksList = new ArrayList<>();
    int row = 0;

    public List<Books> selectAllBooks() {
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from books_list";

            pstm = con.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Books books = new Books();
                books.setBid(rs.getInt("bid"));
                books.setBookname(rs.getString("bookname"));
                books.setAuthor(rs.getString("author"));
                books.setDate(rs.getString("date"));
                books.setSort(rs.getString("sort"));
                books.setPrice(rs.getDouble("price"));
                booksList.add(books);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }

        return booksList;
    }
    public Books findBooksById(int bid){
        Books books = new Books();
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from books_list where bid=?";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,bid);

            rs = pstm.executeQuery();

            while (rs.next()) {
                books.setBid(rs.getInt("bid"));
                books.setBookname(rs.getString("bookname"));
                books.setAuthor(rs.getString("author"));
                books.setDate(rs.getString("date"));
                books.setSort(rs.getString("sort"));
                books.setPrice(rs.getDouble("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }

        return books;
    }
    public int addBooks(Books books){
        try {
            con = JDBCUtil.getCon();

            String sql = "insert into books_list(bookname,author,date,sort,price) values(?,?,?,?,?)";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,books.getBookname());
            pstm.setObject(2,books.getAuthor());
            pstm.setObject(3,books.getDate());
            pstm.setObject(4,books.getSort());
            pstm.setObject(5,books.getPrice());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con, pstm);
        }
        return row;
    }
    public int delBooks(int bid){
        try {

            con = JDBCUtil.getCon();

            String sql = "delete from books_list where bid=?";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,bid);

            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con, pstm);
        }
        return row;
    }
    public int updateBooks(Books books){
        try {
            con = JDBCUtil.getCon();

            String sql = "update books_list set bookname=?,author=?,date=?,sort=?,price=? WHERE bid = ?";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,books.getBookname());
            pstm.setObject(2,books.getAuthor());
            pstm.setObject(3,books.getDate());
            pstm.setObject(4,books.getSort());
            pstm.setObject(5,books.getPrice());
            pstm.setObject(6,books.getBid());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con, pstm);
        }
        return row;
    }
    public List<Books> seachBooks(String keyword){
        List<Books> booksList = new ArrayList<>();
        try {
            con = JDBCUtil.getCon();

            String sql = "select * from books_list where bookname like concat('%',?,'%')";

            pstm = con.prepareStatement(sql);

            pstm.setObject(1,keyword);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Books books = new Books();
                books.setBid(rs.getInt("bid"));
                books.setBookname(rs.getString("bookname"));
                books.setAuthor(rs.getString("author"));
                books.setDate(rs.getString("date"));
                books.setSort(rs.getString("sort"));
                books.setPrice(rs.getDouble("price"));
                booksList.add(books);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, con, pstm);
        }
        return booksList;
    }
}