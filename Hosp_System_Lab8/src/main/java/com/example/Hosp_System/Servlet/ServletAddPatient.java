package com.example.Hosp_System.Servlet;

import com.example.Hosp_System.Entity.Doctor;
import com.example.Hosp_System.Entity.Patient;
import com.example.Hosp_System.Sevice.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAddPatient", value = "/ServletAddPatient")
public class ServletAddPatient extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Patient p = new Patient();
        p.setId(Integer.parseInt(request.getParameter("id")));
        p.setName(request.getParameter("name"));
        p.setEmail(request.getParameter("email"));
        p.setPassword(request.getParameter("password"));
        p.setDiagnosis(request.getParameter("diagnosis"));
        Service s = new Service();
        boolean state = s.addPatient(p);
        if (state) {
            request.getRequestDispatcher("Patient_list.jsp").include(request, response);;
        }
    }
}
