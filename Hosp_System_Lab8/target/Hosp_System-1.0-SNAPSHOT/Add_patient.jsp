<%@ page import="com.example.Hosp_System.Entity.Diagnosis" %>
<%@ page import="com.example.Hosp_System.Sevice.Service" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file  = "Header.jsp"%>
<%
    Service service = new Service();
    List<Diagnosis> list  = service.listAllDiagnosis();
%>
<div class="container">
    <form action="ServletAddPatient" method="post">
        <div class="form-group">
            <label for="id">Patient ID</label>
            <input type="number" name="id" class="form-control" id="id">
        </div>
        <div class="form-group">
            <label for="name">Patient name</label>
            <input type="text" name="name" class="form-control" id="name">
        </div>
        <div class="form-group">
            <label for="email">Patient email</label>
            <input type="text" name="email" class="form-control" id="email">
        </div>
        <div class="form-group">
            <label for="password">Patient password</label>
            <input type="text" name="password" class="form-control" id="password">
        </div>
        <div class="form-group">
            <label>Patient diagnosis</label>
            <select name="diagnosis">
                <%
                    for (Diagnosis d: list) {
                %>
                <option value="<%=d.getName()%>"><%=d.getName()%></option>
                <%
                    }
                %>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
