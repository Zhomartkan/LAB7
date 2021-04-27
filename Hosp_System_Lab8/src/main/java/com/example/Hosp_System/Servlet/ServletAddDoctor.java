package com.example.Hosp_System.Servlet;

import com.example.Hosp_System.Entity.Diagnosis;
import com.example.Hosp_System.Entity.Doctor;
import com.example.Hosp_System.Sevice.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAddDoctor", value = "/ServletAddDoctor")
public class ServletAddDoctor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Doctor d = new Doctor();
        d.setId(Integer.parseInt(request.getParameter("id")));
        d.setName(request.getParameter("name"));
        d.setEmail(request.getParameter("email"));
        d.setPassword(request.getParameter("password"));
        Service s = new Service();
        boolean state = s.addDoctors(d);
        if (state) {
            request.getRequestDispatcher("Doctor_list.jsp").include(request, response);;
        }
    }
}
