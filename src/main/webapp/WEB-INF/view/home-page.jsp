<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SBG Home</title>
</head>
<body>
	<h1 align="center">Smartphone Buyer Guide</h1>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input  id="yn" path="userName" />
			</p>
			<p>
				<label for="dmn">Desired Mobile Name :</label>
				<form:input  id="dmn" path="mobileName" />
			</p>
			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>