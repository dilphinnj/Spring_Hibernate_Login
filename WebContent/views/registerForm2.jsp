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
user name using $ =${model1.uname}

<% Map myMap = (Map)request.getAttribute("model1");%>

<% out.print("/ user name using jsp Map ="+myMap.get("uname")+"<br><br>"); %>

	<form method="post" action="/regi" id="addRegistration">

		<table width="100%" cellpadding="5em" cellspacing="5em">

			<tr>
				<td style="width: 22%"><b> Enter Student Name :</b></td>

				<td><input type="text" id="stuName" name="stuName" required
					data-validation-required-message="Field is Required"></td>

			</tr>

			<tr>
				<td style="width: 22%"><b> Student NIC :</b></td>

				<td><input type="text" id="stuNIC" name="stuNIC" required
					data-validation-required-message="Field is Required"></td>

			</tr>
			<tr>
				<td style="width: 22%"><b> Student Email :</b></td>

				<td><input type="email" id="stuEmail" name="stuEmail" required
					data-validation-required-message="Field is Required">
				<div id="houseHolderNameErr" class="err"></div></td>

			</tr>

			<tr>
				<td style="width: 22%"><b>Student Tel :</b></td>

				<td><input type="text" id="stuTel" name="stuTel" required
					data-validation-required-message="Field is Required">
				</div></td>

			</tr>



			<tr>
				<td style="width: 22%"><b>Is the Student Enrolled ?</b></td>

				<td><select name="slctConfOwner" id="slctConfOwner">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
				</select></td>
			</tr>


			<tr>
				<td colspan="2">
					<button type="submit" id="submit">Submit</button>
				</td>
			</tr>


		</table>
	</form>




</body>
</html>

