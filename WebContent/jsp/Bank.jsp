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
		action="/user-web/BankUser">
		<table>
			<tr>
				<td>BankName:</td>
				<td><select name="BankName" id="BankName">
						<option value="BOFA">BOFA</option>
						<option value="Chase">Chase</option>
						<option value="Discover">Discover</option>
						<option value="Wells Fargo">WellsFargo</option>
				</select></td>
			</tr>
			<tr>
				<td>Account #:</td>
				<td><form:input path="account" /></td>
			</tr>
			<tr>
				<td>SSN:</td>
				<td><form:input path="SSN" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>