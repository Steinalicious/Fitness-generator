<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!-- this page diplays user information -->
<html lang="en">

	<head>
    	<title>User Profile</title>
	</head>
	<body>
	<nav>
		<a href="../workout">WorkOut!</a>
		<a href="../stats">Stats</a>
		<a href="../profile">Profile</a>
	</nav>
		<h1>Profile</h1>
	 <c:choose>
        <c:when test="${not empty user}">
            <table>
				<tr>
					<td> Username: </td>
					<td> ${user.userName}</td>
				</tr>
				<tr>
					<td> Age: </td>
					<td> ${user.age}</td>
				</tr>
				<tr>
					<td> Gender: </td>
					<td> ${user.gender} </td>
				</tr>
				<tr>
					<td> Weight: </td>
					<td> ${user.weight} kg </td>
				</tr>
				<tr>
					<td> Height: </td>
					<td> ${user.height} cm </td>
				</tr>
            </table>
        </c:when>
        <c:otherwise>
            <h3>There should be User profile here :(</h3>
        </c:otherwise>
    </c:choose>
	</body>
</html>