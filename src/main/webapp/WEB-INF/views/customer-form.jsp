
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Customer Form</title></head>
<body>
<h2>Create Customer Profile</h2>
<form action="saveCustomer" method="post">
    Name: <input type="text" name="name"/><br/>
    Email: <input type="email" name="email"/><br/>
    <input type="submit" value="Save"/>
</form>
</body>
</html>