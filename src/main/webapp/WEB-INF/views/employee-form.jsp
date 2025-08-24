<%-- src/main/webapp/WEB-INF/views/employee-form.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
</head>
<body>
<h2>Employee Details</h2>

<form:form action="saveEmployee" modelAttribute="employee" method="POST">
    <form:hidden path="employeeId" />

    <table>
        <tr>
            <td><label>First Name:</label></td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td><label>Last Name:</label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><label>Email:</label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><label>Phone Number:</label></td>
            <td><form:input path="phoneNumber" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>

<p>
    <a href="list">Back to List</a>
</p>
</body>
</html>