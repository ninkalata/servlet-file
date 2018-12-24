<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<th>Customer Code</th>
				<th>customerNAME</th>
				<th> customerAddress1</th>
				<th>customerAddress2</th>
				<th>customerPinCode</th>
				<th>emailaddress</th>
				<th>contactNumber</th>
				<th>primaryContactPerson</th>
				<th>recordStatus</th>
				<th>activeInactiveFlag</th>
				<th>createDate</th>
				<th>createBy</th>
				<th>modifiedDate</th>
				<th>modifiedBy</th>
				<th>authorizedDate</th>
				<th>authorizedBy</th>
				<th colspan="2">Action</th>
			</tr>
			</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
			<tr>
					<td><c:out value="${user.customerCode}" /></td>
					<td><c:out value="${user.customerName}" /></td>
					<td><c:out value="${user.customerAddress1}" /></td>
					<td><c:out  value="${user.customerAddress2}" /></td>
					<td><c:out  value="${user.customerPinCode}"/></td>
					<td><c:out  value="${user.emailaddress}"/></td>
					<td><c:out  value="${user.contactNumber}"/></td>
					<td><c:out  value="${user.primaryContactPerson}"/></td>
					<td><c:out  value="${user.recordStatus}"/></td>
					<td><c:out  value="${user.activeInactiveFlag}"/></td>
						<td><c:out  value="${user.createDate}"/></td>
						<td><c:out  value="${user.createdBy}"/></td>	
							<td><c:out  value="${user.modifiedDate}"/></td>	
								<td><c:out  value="${user.modifiedBy}"/></td>	
								<td><c:out  value="${user.authorizedDate}"/></td>
									<td><c:out  value="${user.authorizedBy}"/></td>	
									<td><a
						href="NewUserController?action=edit&customerCode=<c:out value="${user.customerCode}"/>">Update</a></td>
					<td><a
						href="NewUserController?action=delete&customerCode=<c:out value="${user.customerCode}"/>">Delete</a></td>
				</tr>	
</c:forEach>
</tbody>
	</table>
	<p>
		<a href="NewUserController?action=insert">AddU</a>
	</p>

</body>
</html>