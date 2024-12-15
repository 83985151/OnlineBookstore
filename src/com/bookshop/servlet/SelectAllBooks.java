package com.bookshop.servlet;

import com.bookshop.bean.Books;
import com.bookshop.bean.Order;
import com.bookshop.bean.User;
import com.bookshop.dao.BooksDao;
import com.bookshop.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllBooks")
public class SelectAllBooks extends HttpServlet { //自动查找所有图书信息后跳转到图书管理系统页面或网上书店页面，或对存在已修改过数据库数据的页面进行刷新
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            BooksDao booksdao = new BooksDao();
            List<Books> booksList = booksdao.selectAllBooks();
            HttpSession session = request.getSession();
            session.setAttribute("booksList", booksList);
            User user = (User) session.getAttribute("user");
            if (user.getUserkind().equals("管理员")) {
                response.sendRedirect("BMS.jsp");
            } else if (user.getUserkind().equals("用户")) {
                response.sendRedirect("bookShop.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
