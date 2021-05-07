<%@ page import="com.example.Hosp_System.Entity.Patient" %>
<%@ page import="com.example.Hosp_System.Entity.Doctor" %>
<%@ page import="com.example.Hosp_System.Entity.Admin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Patient patient = (Patient) session.getAttribute("patient");
    Doctor doctor = (Doctor) session.getAttribute("doctor");
    Admin admin = (Admin) session.getAttribute("admin");

    if (patient != null) {
        request.getRequestDispatcher("Patient.jsp").forward(request, response);
    } else if (doctor != null) {
        request.getRequestDispatcher("Doctor.jsp").forward(request, response);
    } else if (admin != null) {
        request.getRequestDispatcher("Admin.jsp").forward(request, response);
    } else {
        response.sendRedirect("index.jsp");
    }
%>
