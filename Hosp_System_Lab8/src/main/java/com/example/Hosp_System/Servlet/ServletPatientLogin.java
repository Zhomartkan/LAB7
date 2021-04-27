package com.example.Hosp_System.Servlet;

import com.example.Hosp_System.Entity.Doctor;
import com.example.Hosp_System.Entity.Patient;
import com.example.Hosp_System.Sevice.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PatientLogin", value = "/PatientLogin")
public class ServletPatientLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Patient patient = new Service().patientLogin(request.getParameter("email"), request.getParameter("password"));
        if(patient != null) {
            HttpSession session = request.getSession();
            session.setAttribute("patient", patient);
            response.sendRedirect("Patient.jsp");
        }else {
            response.sendRedirect("Patient_login.jsp");
        }
    }
}
