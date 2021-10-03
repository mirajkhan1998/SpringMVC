<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
<style type="text/css">
table {
	width: 80%;
	font-family: consolas;
	font-size: 16px;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #eee
}

tr:nth-child(odd) {
	background-color: #fff
}

th {
	background-color: green;
	color: white;
}
</style>
</head>
<body>
	<h2>Staffs</h2>
	<table>
		<tr>
			<th>staffNo</th>
			<th>staffName</th>
			<th>gender</th>
			<th>emailAddress</th>
			<th>mobileNo</th>
			<th>age</th>
		</tr>
		<c:forEach items="${staffs}" var="staff">
			<tr>
				<td>${staff.staffNo}</td>
				<td>${staff.staffName}</td>
				<td>${staff.emailAddress }</td>
				<td>${staff.gender}</td>
				<td>${staff.mobileNo}</td>
				<td>${staff.age }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>