<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PersonalInfo</title>
</head>
<body>
	<center>
		<h1>Personal Info Page</h1>
	</center>
	<form:form method="GET" modelAttribute="user"
		action="/user-web/AddUser">
		<table>
			<tr>
				<td>FirstName:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><form:input path="lastName" /></td>
			</tr>

			<tr>
				<td>MiddleName:</td>
				<td><form:input path="middleName" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="male" checked>
					Male <input type="radio" name="gender" value="female">
					Female</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>