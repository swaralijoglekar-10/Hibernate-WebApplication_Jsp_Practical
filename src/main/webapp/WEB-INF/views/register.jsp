<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Register</title>
</head>
<body>
<h2>Register</h2>
<form action="<c:url value='/auth/register' />" method="post">
  <label for="username">Username:</label>
  <input type="text" name="username" id="username" required /><br/>

  <label for="password">Password:</label>
  <input type="password" name="password" id="password" required /><br/>

  <label for="email">Email:</label>
  <input type="email" name="email" id="email" required /><br/>

  <input type="submit" value="Register" />
</form>

<a href="<c:url value='/auth/login' />">Login</a>
</body>
</html>