package com.bookshop.servlet;

import com.bookshop.bean.Order;
import com.bookshop.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/seachOrderByBookname")
public class SeachOrderByBookname extends HttpServlet { //根据购买的书名查找订单（用户使用）
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
            OrderDao orderDao = new OrderDao();
            List<Order> userorderList = orderDao.seachOrderByBookname(keyword);
            HttpSession session = request.getSession();
            session.setAttribute("userorderList", userorderList);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            response.sendRedirect("userOrder.jsp");
        }
    }
}