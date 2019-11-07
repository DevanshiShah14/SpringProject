<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PersonalInfo</title>
</head>
<body>
	<center>
		<h1>Contact Info Page</h1>
	</center>
	<form:form method="GET" modelAttribute="user"
		action="/user-web/ContactUser">
		<table>
			<tr>
				<td>Address:</td>
				<td><form:input path="Address" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input path="state" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select name="country" id="country">
						<option value="USA">USA</option>
						<option value="Canada">Canada</option>
						<option value="India">India</option>
						<option value="Australia">Australia</option>
				</select></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><form:input path="phone" type="tel" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>