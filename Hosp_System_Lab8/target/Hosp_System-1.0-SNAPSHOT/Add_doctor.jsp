<%--
  Created by IntelliJ IDEA.
  User: Zhomart
  Date: 25.04.2021
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file  = "Header.jsp"%>
<div class="container">
    <form action="ServletAddDoctor" method="post">
        <div class="form-group">
            <label for="id">Doctor ID</label>
            <input type="number" name="id" class="form-control" id="id">
        </div>
        <div class="form-group">
            <label for="name">Doctor name</label>
            <input type="text" name="name" class="form-control" id="name">
        </div>
        <div class="form-group">
            <label for="email">Doctor email</label>
            <input type="text" name="email" class="form-control" id="email">
        </div>
        <div class="form-group">
            <label for="password">Doctor password</label>
            <input type="text" name="password" class="form-control" id="password">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
