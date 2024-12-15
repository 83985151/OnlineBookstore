package com.bookshop.servlet;

import com.bookshop.bean.Books;
import com.bookshop.dao.BooksDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/findBooksById")
public class FindBooksById extends HttpServlet { //根据bid查找图书（用于指定图书修改）
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bid = Integer.parseInt(request.getParameter("bid"));
        BooksDao booksDao = new BooksDao();
        Books books = booksDao.findBooksById(bid);
        HttpSession session = request.getSession();
        session.setAttribute("updatebooks",books);
        if (books!=null){
            request.setAttribute("books",books);
            request.getRequestDispatcher("updateBooks.jsp").forward(request,response);
        }else {
            request.setAttribute("error_msg","查询失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
