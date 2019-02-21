<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="<spring:url value='/static/css/main.css'/>"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login</title>
		<style>
			.error {
				color: red; font-weight: bold;
			}
		</style>
	</head>
	<body>
		<div align="center" class="main">
			<h2>Spring MVC Form</h2>
			<table border="0" width="90%">
				<form:form action="save" method="post" modelAttribute="student">
					<tr>
						<td align="left" width="20%">Name: </td>
						<td align="left" width="40%"><form:input path="firstName" size="30"/></td>
						<td align="left"><form:errors path="firstName" cssClass="error"/></td>
					</tr>
					<tr>
						<td>Family: </td>
						<td><form:input path="lastName" size="30"/></td>
						<td><form:errors path="lastName" cssClass="error"/></td>
					</tr>
					<tr>
						<td>Family: </td>
						<td><form:input path="email" size="30"/></td>
						<td><form:errors path="email" cssClass="error"/></td>
					</tr>
					<tr>
						<td></td>
						<td align="center"><input type="submit" value="Save"/></td>
						<td></td>
					</tr>
				</form:form>
			</table>
		</div>
	</body>
</html>