package com.bookshop.servlet;

import com.bookshop.bean.User;
import com.bookshop.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet { //登录系统，确定根据输入的用户名和密码查找到的信息不为空时再根据用户类型判断跳转到管理员页面还是用户页面
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDao = new UserDao();
        User login = userDao.login(username, password);
        if (login.getUid() != null && login.getPassword() != null) {
               if (login.getUserkind().equals("管理员")){
                   HttpSession session = request.getSession();
                   session.setAttribute("user", login);
                   response.sendRedirect("managerPage.jsp");
               }
               else if(login.getUserkind().equals("用户")){
                   HttpSession session = request.getSession();
                   session.setAttribute("user", login);
                   response.sendRedirect("userPage.jsp");
               }
        } else {
            request.setAttribute("error_msg","登陆失败！请重新输入账号或密码！");
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}