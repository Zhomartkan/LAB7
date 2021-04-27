package com.example.Hosp_System.Servlet;

import com.example.Hosp_System.Entity.Admin;
import com.example.Hosp_System.Sevice.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdminLogin", value = "/AdminLogin")
public class ServletAdminLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Admin admin = new Service().adminLogin(request.getParameter("email"), request.getParameter("password"));
        if(admin != null) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", admin);
            response.sendRedirect("Admin.jsp");
        }else {
            response.sendRedirect("Admin_login.jsp");
        }
    }
}
