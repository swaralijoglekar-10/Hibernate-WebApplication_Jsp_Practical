<%-- src/main/webapp/WEB-INF/views/book-form.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Form</title>
</head>
<body>
<h2>Book Details</h2>

<form:form action="saveBook" modelAttribute="book" method="POST">
    <form:hidden path="bookId" />

    <table>
        <tr>
            <td><label>Title:</label></td>
            <td><form:input path="title" /></td>
        </tr>
        <tr>
            <td><label>ISBN:</label></td>
            <td><form:input path="isbn" /></td>
        </tr>
        <tr>
            <td><label>Price:</label></td>
            <td><form:input path="price" /></td>
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