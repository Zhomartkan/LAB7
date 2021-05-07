<%@ page import="com.example.Hosp_System.Entity.Patient" %>
<%@include file  = "Header.jsp"%>
<%
    Patient patient = (Patient) session.getAttribute("patient");
%>
<div class="container">
    <h1>Patient page</h1>
    <hr>
    <h3>Patient details</h3>
    <h4>Id</h4>
    <p><%=patient.getId()%></p>
    <h4>Name</h4>
    <p><%=patient.getName()%></p>
    <h4>Email</h4>
    <p><%=patient.getEmail()%></p>
    <h4>Password</h4>
    <p><%=patient.getPassword()%></p>
    <h4>Diagnosis</h4>
    <p><%=patient.getDiagnosis()%></p>
</div>

<%@include file  = "Footer.jsp"%>
