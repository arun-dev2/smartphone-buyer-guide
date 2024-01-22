<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>

	<h1 align="center">Register Your profiler here...</h1>
	<hr>
	<div align="center">
		<form:form action = "registration-sucess" method = "Get" modelAttribute="userRegistrationInfo">
			<label>Name :</label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error"></form:errors>
			<br>
			<label>User Name :</label>
			<form:input path="userName" />
			<form:errors path="userName" cssClass="error"></form:errors>
			<br>
			<label>Password :</label>
			<form:password path="password" />
			<br>
			<label>Country :</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India" />
				<form:option value="Pak" label="Pakisthan" />
				<form:option value="Aus" label="Australia" />
				<form:option value="Sl" label="Srilanka" />
				<form:option value="Usa" label="United states of America" />
			</form:select>
			<br>
			<label>Choose Specification :</label>
			Snapdragon : <form:checkbox path="requiredSpecification"
				value="snapdragon" />
			InDisplay FingerPrint : <form:checkbox path="requiredSpecification"
				value="inDisplayFingerPrint" />
			OIS : <form:checkbox path="requiredSpecification" value="ois" />
			Above 4000mah : <form:checkbox path="requiredSpecification"
				value="4000mah" />
			SonyImxSensor : <form:checkbox path="requiredSpecification"
				value="sonyImxSensor" />
			OLED Display : <form:checkbox path="requiredSpecification"
				value="oledDisplay" />
			<br>
			<label>Charger Variant :</label>
			120 W<form:radiobutton path="chargerType" value="120 w" />
			60 W<form:radiobutton path="chargerType" value="60 w" />
			<br>
			<br>
			<label>Expected Budget Price :</label>
			<form:input path="expectedPrice" />
			<form:errors path="expectedPrice" cssClass="error"></form:errors>
			<br>
			<div align = "center">
			<h2>Communication</h2>
			<label>Email :</label>
			<form:input path="contactDTO.email" />
			<form:errors path="contactDTO.email" cssClass="error"></form:errors>
			<br>
			<label>Phone :</label>
			<form:input path="contactDTO.phone" />
			<br>
			</div>
			<input type="submit" value="register">

		</form:form>
	</div>


</body>
</html>