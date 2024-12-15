package com.bookshop.servlet;

import com.bookshop.bean.Books;
import com.bookshop.bean.User;
import com.bookshop.dao.BooksDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/userseachBooks")
public class UserSeachBooks extends HttpServlet { //用户根据输入的书名（keyword）查找图书
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String keyword = request.getParameter("keyword");
        try {
            BooksDao booksdao = new BooksDao();
            List<Books> booksList = booksdao.seachBooks(keyword);
            HttpSession session = request.getSession();
            session.setAttribute("booksList", booksList);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            response.sendRedirect("bookShop.jsp");
        }
    }
}