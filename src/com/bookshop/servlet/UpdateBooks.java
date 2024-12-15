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

@WebServlet("/updateBooks")
public class UpdateBooks extends HttpServlet { //根据页面输入的信息对图书信息进行修改
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        Books book = new Books();
        HttpSession session = request.getSession();
        Books books = (Books) session.getAttribute("updatebooks");
        book.setBid(books.getBid());
        book.setBookname(request.getParameter("bookname"));
        book.setAuthor(request.getParameter("author"));
        book.setDate(request.getParameter("date"));
        book.setSort(request.getParameter("sort"));
        book.setPrice(Double.parseDouble(request.getParameter("price")));
        BooksDao booksDao = new BooksDao();
        int row = booksDao.updateBooks(book);
        if (row >0) {
            request.getRequestDispatcher("selectAllBooks").forward(request, response);
        } else {
            request.setAttribute("error_msg","修改操作失败！");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}