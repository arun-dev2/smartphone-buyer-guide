<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration-Sucess</title>
</head>
<body>
	<h1 align="center">Registration is Successful</h1>
	<hr>
	<h2>Hai, ${userRegistrationInfo.name} your details and selected
		opinions are successfully stored in database.</h2>
	UserName: ${userRegistrationInfo.userName}
	<br> Password: ${userRegistrationInfo.password}
	<br> CountryName: ${userRegistrationInfo.countryName}
	<br> RequiredSpecification:
	<c:forEach var="temp"
		items="${userRegistrationInfo.requiredSpecification}">
	${temp}
	</c:forEach>
	<br> ChargerType: ${userRegistrationInfo.chargerType}
	<br>
</body>
</html>