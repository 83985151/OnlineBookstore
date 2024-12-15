package com.bookshop.servlet;

import com.bookshop.bean.Order;
import com.bookshop.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findOrderById")
public class FindOrderById extends HttpServlet { //根据oid查找订单信息（用于管理员确认用户已付款）
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int oid = Integer.parseInt(request.getParameter("oid"));
        OrderDao orderDao = new OrderDao();
        Order order = orderDao.findOrderById(oid);
        if (order!=null){
            request.setAttribute("order",order);
            request.getRequestDispatcher("payOrder").forward(request,response);
        }else {
            request.setAttribute("error_msg","查询失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
