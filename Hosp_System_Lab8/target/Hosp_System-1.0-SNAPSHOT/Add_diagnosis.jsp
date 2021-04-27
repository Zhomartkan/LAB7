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
    <form action="ServletAddDiagnosis" method="post">
        <div class="form-group">
            <label for="id">Diagnosis ID</label>
            <input type="number" name="id" class="form-control" id="id">
        </div>
        <div class="form-group">
            <label for="name">Diagnosis name</label>
            <input type="text" name="name" class="form-control" id="name">
        </div>
        <div class="form-group">
            <label for="treatment">Treatment</label>
            <input type="text" name="treatment" class="form-control" id="treatment">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
