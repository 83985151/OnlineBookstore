package com.bookshop.servlet;

import com.bookshop.bean.Order;
import com.bookshop.bean.User;
import com.bookshop.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectUserOrder")
public class SelectUserOrder extends HttpServlet { //自动查找对应用户的所有订单信息后跳转到用户订单页面，或对存在已修改过数据库数据的页面进行刷新
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            OrderDao orderdao = new OrderDao();
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            int uid = user.getUid();
            List<Order> userorderList = orderdao.selectUserOrder(uid);
            System.out.println(userorderList);
            session.setAttribute("userorderList", userorderList);
            if (user.getUserkind().equals("用户")) {
                response.sendRedirect("userOrder.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}