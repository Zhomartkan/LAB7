<%@ page import="com.example.Hosp_System.Entity.Patient" %>
<%@ page import="com.example.Hosp_System.Sevice.Service" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Hosp_System.Entity.Doctor" %>
<%@include file  = "Header.jsp"%>

<div class="container">
    <%
        Service service = new Service();
        List<Doctor> list  = service.listAllDoctors();
        for (Doctor d: list ){
    %>

    <ul class="list-group list-group-horizontal">
        <li class="list-group-item"><%=d.getId() %></li>
        <li class="list-group-item"><%=d.getName() %></li>
        <li class="list-group-item"><%=d.getEmail() %></li>
    </ul>
    <br>

    <%
        }

    %>
</div>
<%@include file  = "Footer.jsp"%>
