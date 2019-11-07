<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@include file="header.html"%>
<html>
<body>
<h2> SuccessFully Registered!</h2>
<table>
	<tr>
		<td><font color="red">Personal Information</font></td>
	</tr>
	<tr>
		<td>FirstName: </td><td>${user.firstName}</td>
	</tr>
	<tr>
		<td>LastName: </td><td>${user.lastName}</td>
	</tr>
	<tr>
		<td>MiddleName: </td><td>${user.middleName}</td>
	</tr>
	</table>
	</br>
		<font color="red"> Contact Information</font>
	<table>
	<tr>
		<td>Address:  </td><td>     </td><td>${user.address}</td>
	</tr>
	<tr>
		<td>City:  </td><td>     </td><td>${user.city}</td>
	</tr>
	<tr>
		<td>State:   </td><td>      </td><td>${user.state}</td>
	</tr>
	<tr>
		<td>Country: </td><td>      </td><td>${user.country}</td>
	</tr>
	<tr>
		<td>Phone: </td><td>      </td><td>${user.phone}</td>
	</tr>
	</table>
		<font color="red"> Bank Information</font>
	<table>
	<tr>
		<td>BankName: </td><td>       </td><td>${user.bankName}</td>
	</tr>
	<tr>
		<td>AccountNo: </td><td>     </td><td>${user.account}</td>
	</tr>
	<tr>
		<td>SSN: </td><td>   </td><td>${user.SSN}</td>
	</tr>
</table>

</body>
</html>