<%@ page import="com.example.Hosp_System.Entity.Patient" %>
<%@ page import="com.example.Hosp_System.Sevice.Service" %>
<%@ page import="java.util.List" %>
<%@include file  = "Header.jsp"%>

<div class="container">
    <%
        Service service = new Service();
        List<Patient> list  = service.listAllPatient();
        for (Patient p: list ){
    %>

    <ul class="list-group list-group-horizontal">
        <li class="list-group-item"><%=p.getId() %></li>
        <li class="list-group-item"><%=p.getName() %></li>
        <li class="list-group-item"><%=p.getDiagnosis() %></li>
    </ul>
    <br>

    <%
        }

    %>
</div>
<%@include file  = "Footer.jsp"%>
