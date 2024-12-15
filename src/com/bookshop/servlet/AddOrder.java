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

@WebServlet("/addOrder")
public class AddOrder extends HttpServlet { //根据用户所选的图书，生成并添加新的订单信息
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int bid = Integer.parseInt(request.getParameter("bid"));
        BooksDao booksDao = new BooksDao();
        Books books = booksDao.findBooksById(bid);
        Order order = new Order();
        order.setBookname(books.getBookname());
        order.setPrice(books.getPrice());
        order.setUsername(user.getUsername());
        order.setPayment("未付款");
        order.setUid(user.getUid());
        OrderDao orderDao = new OrderDao();
        int row = orderDao.addOrder(order);
        if (row >0){
            response.sendRedirect("bookShop.jsp");
        }else {
            request.setAttribute("error_msg","添加订单信息失败！");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}