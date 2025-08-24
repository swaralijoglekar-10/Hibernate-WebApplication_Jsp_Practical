<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Account Form</title>
</head>
<body>
<h2>Account Form</h2>
<form action="displayDetails" method="post">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
    </div>
    <div>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>