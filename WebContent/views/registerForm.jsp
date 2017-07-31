<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>

<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<%-- %@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Registration</title>


<!-- Add custom CSS here -->
<style type="text/css">
.err {
	color: red;
	display: none;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



<script>
	$(document).ready(function() {
		//var un = ${model1.uname};
		//alert("hello"+un );
	});
</script>


</head>
<body>

<%
		Map myMap = (Map) request.getAttribute("regModel");
// 		out.print("<br><br>Test user name - dilip and password is - pass123 <br>");
		
		if (myMap != null)
			out.print(" " + myMap.get("status") + "<br><br>");
 	
	%>


	<form method="post" action="../spring/regUser" id="addRegistration">

		<table width="100%" cellpadding="5em" cellspacing="5em">

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
				<td >
					<button type="submit" id="submit">Submit</button>
				</td>
			</tr>


		</table>
	</form>




</body>
</html>

