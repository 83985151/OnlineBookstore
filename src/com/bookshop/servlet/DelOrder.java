package com.bookshop.servlet;

import com.bookshop.bean.User;
import com.bookshop.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/delOrder")
public class DelOrder extends HttpServlet { //删除订单信息
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int oid = Integer.parseInt(request.getParameter("oid"));
        OrderDao orderDao = new OrderDao();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int i = orderDao.delOrder(oid);
        if (i>0 && user.getUserkind().equals("管理员")){
            request.getRequestDispatcher("selectAllOrder").forward(request,response);
        }else if (i>0 && user.getUserkind().equals("用户")){
            request.getRequestDispatcher("selectUserOrder").forward(request,response);
        }
        else{
            request.setAttribute("error_msg","删除操作失败");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}