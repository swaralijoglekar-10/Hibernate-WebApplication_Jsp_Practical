<%-- src/main/webapp/WEB-INF/views/book-details.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
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
<h2>Book Management System</h2>

<input type="button" value="Add Book"
       onclick="window.location.href='showFormForAdd'; return false;"
       class="add-button" />

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>ISBN</th>
        <th>Price</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.title}</td>
            <td>${book.isbn}</td>
            <td>${book.price}</td>
            <td>
                <a href="showFormForUpdate?bookId=${book.bookId}">Update</a>
                |
                <a href="delete?bookId=${book.bookId}"
                   onclick="if (!confirm('Are you sure you want to delete this book?')) return false;">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>