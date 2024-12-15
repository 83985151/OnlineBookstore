package com.bookshop.servlet;

import com.bookshop.bean.Books;
import com.bookshop.bean.User;
import com.bookshop.dao.BooksDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addBooks")
public class AddBooks extends HttpServlet { //根据页面输入的信息添加新的图书信息
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        Books books = new Books();
        books.setBookname(request.getParameter("bookname"));
        books.setAuthor(request.getParameter("author"));
        books.setDate(request.getParameter("date"));
        books.setSort(request.getParameter("sort"));
        books.setPrice(Double.parseDouble(request.getParameter("price")));
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        BooksDao booksDao = new BooksDao();
        int row = booksDao.addBooks(books);
        if (row >0){
            request.getRequestDispatcher("selectAllBooks").forward(request,response);
        }else {
            request.setAttribute("error_msg","添加图书信息失败！");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }


    }
}