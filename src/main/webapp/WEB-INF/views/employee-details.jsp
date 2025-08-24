<%-- src/main/webapp/WEB-INF/views/employee-details.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .add-button {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<h2>Employee Management System</h2>

<input type="button" value="Add Employee"
       onclick="window.location.href='showFormForAdd'; return false;"
       class="add-button" />

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.employeeId}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.email}</td>
            <td>${employee.phoneNumber}</td>
            <td>
                <a href="showFormForUpdate?employeeId=${employee.employeeId}">Update</a>
                |
                <a href="delete?employeeId=${employee.employeeId}"
                   onclick="if (!confirm('Are you sure you want to delete this employee?')) return false;">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>