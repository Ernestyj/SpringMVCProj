<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<body>
	<%--<h1>${message}</h1>--%>
	<h2>Welcome to Spittr</h2>
	<a href="<c:url value="/spittles" />">Spittles</a> |
	<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>