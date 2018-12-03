<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!-- Sign up page Where user fills in information about himself -->
<html lang="en">

	<head>
    	<title>Sign Up</title>
	</head>
	<body>

	<h1>Sign Up</h1>
	 
	<sf:form method="POST" modelAttribute="user">
		<table>
			<tr>
				<td> Username: </td>
				<td> <sf:input path="name" type="text" placeholder="Choose a username"/> </td>
			</tr>
			<tr>
				<td> Password: </td>
				<td> <sf:input path="password" type="text" placeholder="Choose a password"/> </td>
			</tr>
			<tr>
				<td> Age: </td>
				<td> <sf:input path="age" type="number" min="1" max="99"/> </td>
			</tr>
			<tr>
				<td> Gender: </td>
				<td> 
					<sf:select path="gender">
						<sf:option value="Female">Female </sf:option>
						<sf:option value="Male">Male</sf:option> 	
					</sf:select>
				 </td>
			</tr>
			<tr>
				<td> Weight: </td>
				<td> <sf:input path="weight" type="number"/> kg </td>
			</tr>
			<tr>
				<td> Height: </td>
				<td> <sf:input path="height" type="number"/> cm </td>
			</tr>

		</table>
		<input type="submit" value="Sign Up!"/>
	</sf:form>
	</body>
</html>