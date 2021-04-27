package com.example.Hosp_System.Servlet;

import com.example.Hosp_System.Entity.Diagnosis;
import com.example.Hosp_System.Sevice.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "ServletAddDiagnosis", value = "/ServletAddDiagnosis")
public class ServletAddDiagnosis extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Diagnosis d = new Diagnosis();
        d.setId(Integer.parseInt(request.getParameter("id")));
        d.setName(request.getParameter("name"));
        d.setTreatment(request.getParameter("treatment"));
        Service s = new Service();
        boolean state = s.addDiagnosis(d);
        if (state) {
            request.getRequestDispatcher("Diagnosis_list.jsp").include(request, response);;
        }
    }
}
