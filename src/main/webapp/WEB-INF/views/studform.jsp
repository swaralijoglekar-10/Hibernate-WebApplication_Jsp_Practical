<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Form Page</title></head>
<body>
<h2>User Information Form</h2>
<form action="${pageContext.request.contextPath}/submitForm" method="post">
    Name: <input type="text" name="name" /><br/><br/>

    Email: <input type="email" name="email" /><br/><br/>

    Gender:
    <input type="radio" name="gender" value="Male" /> Male
    <input type="radio" name="gender" value="Female" /> Female<br/><br/>

    Country:
    <select name="country">
        <option value="India">India</option>
        <option value="USA">USA</option>
        <option value="Germany">Germany</option>
    </select><br/><br/>

    Interests:
    <input type="checkbox" name="interests" value="Coding" /> Coding
    <input type="checkbox" name="interests" value="Reading" /> Reading
    <input type="checkbox" name="interests" value="Gaming" /> Gaming<br/><br/>

    <input type="submit" value="Submit" />
</form>
</body>
</html>