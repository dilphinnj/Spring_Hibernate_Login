<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<%-- %@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html>
<html>
<head>

<title>Login Page</title>

<!-- JQuery lib -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Add custom CSS here -->
<style type="text/css">
.col {
	color: red;
	/* 	align: center; */
	/* 	display: none; */
}
</style>


<script>
	$(document).ready(function() {

		//alert("Hello... Pls Enter Credentials!");
		$("#logintxt1").text("Hello...");
		$("#logintxt1").css("color", "blue");
		$("#logintxt2").text("Pls Enter Credentials!");

		//---------->

	});
</script>

</head>
<body>

<a href="http://localhost:8084/WebProjectFullStack/views/registerForm.jsp">Register</a>

	<%
		Map myMap = (Map) request.getAttribute("model1");
		Map myMap2 = (Map) request.getAttribute("regModel");
// 		out.print("<br><br>Test user name - dilip and password is - pass123 <br>");
		
		if (myMap != null)
			out.print(" " + myMap.get("errormsg") + "<br><br>");
 		else if (myMap2 != null)
 			out.print(" " + myMap2.get("status") + "<br><br>");
	%>

	<div>
		<div id="logintxt1" align="center"></div>
		<div id="logintxt2" class="col" align="center"></div>
	</div>

	<form method="post" action="http://localhost:8084/WebProjectFullStack/spring/login" id="login">

		<table width="100%" cellpadding="5em" style="margin-left: 20%">

			<tr>
				<td style="width: 22%"><b> Enter User Name :</b></td>

				<td><input type="text" id="uName" name="uName" required
					data-validation-required-message="Field is Required"></td>

			</tr>

			<tr>
				<td style="width: 22%"><b> Enter Password :</b></td>

				<td><input type="text" id="uPass" name="uPass" required
					data-validation-required-message="Field is Required"></td>

			</tr>

			<tr>
				<td></td>
				<td colspan="2">
					<button type="submit" id="submit1">SubmitByForm</button> <!-- 					<button type="button" id="submit2">SubmitByAjax</button> -->
				</td>
			</tr>

		</table>
	</form>




</body>
</html>

