<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

	<head>
    	<title>User Workout</title>
    	        <link rel="stylesheet" type="text/css" href="<c:url value="/css/workout.css"/>"/>
	</head>
	<body>
	<nav>
		<a href="workout">WorkOut!</a>
		<a href="stats">Stats</a>
		<a href="profile">Profile</a>
	</nav>
		<h1>Workout!</h1>
		
		<a href="/choose">Choose your workout</a>
		<c:choose>
			<c:when test="${not empty workout}">
			 	<table>
			 		<tr>
				 		<th>Monday</th>
				 		<th>Tuesday</th>
				 		<th>Wednesday</th>
				 		<th>Thursday</th>
				 		<th>Friday</th>
				 		<th>Saturday</th>
				 		<th>Sunday</th>
			 		</tr>
			 		<tr>
			 			<td><p>${exercise.name}</p>
			 				<p>${exercise.reps}</p>
			 				<p>${exercise.sets}</p>
			 			</td>
			 			
			 		</tr>
			 	</table>
			 </c:when>
			 
			 <c:otherwise>
				<h3>No workout has been Selected</h3>
			 </c:otherwise>
		 </c:choose>
	</body>
</html>