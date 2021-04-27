<%@ page import="com.example.Hosp_System.Sevice.Service" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Hosp_System.Entity.Diagnosis" %><%--
  Created by IntelliJ IDEA.
  User: Zhomart
  Date: 25.04.2021
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file  = "Header.jsp"%>

<div class="container">
    <%
        Service service = new Service();
        List <Diagnosis> list  = service.listAllDiagnosis();
        for (Diagnosis d: list ){
    %>

    <ul class="list-group list-group-horizontal">
        <li class="list-group-item"><%=d.getId() %></li>
        <li class="list-group-item"><%=d.getName() %></li>
        <li class="list-group-item"><%=d.getTreatment() %></li>
    </ul>
    <br>
    <%
        }

    %>
</div>
<%@include file  = "Footer.jsp"%>
