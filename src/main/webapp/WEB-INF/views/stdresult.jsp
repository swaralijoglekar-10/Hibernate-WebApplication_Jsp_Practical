
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head><title>Form Result</title></head>
<body>
<h2>Submitted Information</h2>
<p><strong>Name:</strong> ${name}</p>
<p><strong>Email:</strong> ${email}</p>
<p><strong>Gender:</strong> ${gender}</p>
<p><strong>Country:</strong> ${country}</p>
<p><strong>Interests:</strong>
    <c:forEach var="interest" items="${interests}">
        ${interest}<c:if test="${!fn:contains(interest, ' ')}">,</c:if>
    </c:forEach>
</p>
</body>
</html>