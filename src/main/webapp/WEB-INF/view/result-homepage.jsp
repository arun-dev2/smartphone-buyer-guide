
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Your Result</title>
</head>
<body>
	<h1 align="center">Smartphone Buyer Guide</h1>
	<hr>
	<h2>Result:</h2>
	<p>Hai, ${userInfo.userName} ur opinion matches with specification
		of smartphone ${userInfo.mobileName}...</p>
		
	<br>
	<a href = "/smartphone-buyer-guide/SendMail">Send result to your mail</a>
	</body>
</html>