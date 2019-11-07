<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@include file="header.html"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Contacts</title>
</head>
<body bgcolor="blue" leftmargin="10px" rightmargin="10px">
<h3> View All Contacts: </h3>
<table border=width="50%">
	<thead>
	<tr>
	<th> FirstName</th>
	<th> MiddleName</th>
	<th> LastName</th>
	<th> Gender</th>
	<th> Address</th>
	<th> City</th>
	<th> State</th>
	<th> Country</th>
	<th> Phone</th>
	<th> BankName</th>
	<th> AccountNo</th>
	<th> SSN</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${PList}" var="data">
	<tr>
	<td> ${data.firstName}</td>
	<td> ${data.middleName}</td>
	<td> ${data.lastName}</td>
	<td> ${data.gender}</td>
	<td> ${data.address}</td>
	<td> ${data.city}</td>
	<td> ${data.state}</td>
	<td> ${data.country}</td>
	<td> ${data.phone}</td>
	<td> ${data.bankName}</td>
	<td> ${data.account}</td>
	<td> ${data.SSN}</td>
	</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>