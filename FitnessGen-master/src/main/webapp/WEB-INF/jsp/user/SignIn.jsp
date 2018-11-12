<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!-- Sign in page where user signs in existing account-->
<html lang="en">

	<head>
    	<title>Sign In</title>
	</head>
	<body>

	<h1>Sign In</h1>
	 
	<sf:form method="POST" modelAttribute="user" action="/user">
		<table>
			<tr>
				<td> Username: </td>
				<td> <sf:input path="userName" type="text" placeholder="Choose a username"/> </td>
			</tr>
			<tr>
				<td> Password: </td>
				<td> <sf:input path="password" type="text" placeholder="Choose a password"/> </td>
			</tr>

		</table>
		<input type="submit" value="Sign Up!"/>
	</sf:form>
	</body>
</html>