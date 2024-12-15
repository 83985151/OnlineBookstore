package com.bookshop.servlet;

import com.bookshop.dao.BooksDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delBooks")
public class DelBooks extends HttpServlet { //删除图书信息
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bid = Integer.parseInt(request.getParameter("bid"));
        BooksDao booksDao = new BooksDao();
        int i = booksDao.delBooks(bid);
        if (i>0){
            request.getRequestDispatcher("selectAllBooks").forward(request,response);
        }else {
            request.setAttribute("error_msg","删除操作失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}