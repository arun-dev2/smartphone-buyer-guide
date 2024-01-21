<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SBG Home</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
function validateUserName(){
	var userName = document.getElementById('yn').value;
	if(userName.length < 3){
		alert("please enter valid user name...")
		return false;
	}
	else{
		return true;
	}
}
</script>
</head>
<body>
	<h1 align="center">Smartphone Buyer Guide</h1>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>
			<br/>
			<p>
				<label for="dmn">Mobile Name :</label>
				<form:input id="dmn" path="mobileName" />
				<form:errors path="mobileName" cssClass="error"></form:errors>
			</p>
			<br/>
			<p>
				<form:checkbox id="check" path="TermsAndCondition" />
				<label>Iam agree to get buying suggestion from
					Smartphone buyer guide.</label>
				<form:errors path="TermsAndCondition" cssClass="error"></form:errors>
			</p>
			<br/> <input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>