<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="<c:url value='/j_spring_security_check' />" method="post">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" required /><br/>

    <label for="password">Password:</label>
    <input type="password" name="password" id="password" required /><br/>

    <input type="submit" value="Login" />
</form>

<c:if test="${not empty param.error}">
    <p style="color:red;">Invalid username or password.</p>
</c:if>

<a href="<c:url value='/auth/register' />">Register</a>
</body>
</html>