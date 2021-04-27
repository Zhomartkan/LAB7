<%--
  Created by IntelliJ IDEA.
  User: Zhomart
  Date: 25.04.2021
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file  = "Header.jsp"%>
<div class="container">
    <h1>Admin page</h1>
    <hr>
    <div class="btn-group" role="group" aria-label="Basic example">
        <a href="Add_doctor.jsp"  type="button" class="btn btn-secondary">Add doctor</a>
        <a href ="Add_patient.jsp" type="button" class="btn btn-secondary">Add patient</a>
        <a href = "Doctor_list.jsp" type="button" class="btn btn-secondary">Show doctor</a>
        <a href = "Patient_list.jsp" type="button" class="btn btn-secondary">Show patient</a>
    </div>
</div>
<%@include file  = "Footer.jsp"%>
