package com.bookshop.servlet;


import com.bookshop.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/payOrder")
public class PayOrder extends HttpServlet { //管理员确认用户已付款后修改订单付款情况
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int oid = Integer.parseInt(request.getParameter("oid"));
        OrderDao orderDao = new OrderDao();
        int i = orderDao.payOrder(oid);
        if (i>0){
            request.getRequestDispatcher("selectAllOrder").forward(request,response);
        }else {
            request.setAttribute("error_msg","删除操作失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
