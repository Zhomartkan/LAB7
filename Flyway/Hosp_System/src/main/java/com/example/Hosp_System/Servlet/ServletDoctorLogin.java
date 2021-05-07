package com.example.Hosp_System.Servlet;

import com.example.Hosp_System.Entity.Admin;
import com.example.Hosp_System.Entity.Doctor;
import com.example.Hosp_System.Sevice.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DoctorLogin", value = "/DoctorLogin")
public class ServletDoctorLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Doctor doctor = new Service().doctorsLogin(request.getParameter("email"), request.getParameter("password"));
        if(doctor != null) {
            HttpSession session = request.getSession();
            session.setAttribute("doctor", doctor);
            response.sendRedirect("Doctor.jsp");
        }else {
            response.sendRedirect("Doctor_login.jsp");
        }
    }
}
