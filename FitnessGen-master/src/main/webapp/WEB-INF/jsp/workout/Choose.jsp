<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

	<head>
    	<title>Create Workout</title>
    	        <link rel="stylesheet" type="text/css" href="<c:url value="/css/workout.css"/>"/>
	</head>
	<body>
	<c:choose>
		<c:when test="${not empty mon}">
			<h1>Choose your Workout!</h1>

			
		  		 <table>
			 		<tr>
			 			<th>Monday</th>
				 		<c:forEach var="monday" items="${mon}">
							
							<td>${monday.exerciseID}</td>			 	
				 		</c:forEach>
				 	</tr>
				 	<tr>
				 		<th>Tuesday</th>
				 		<c:forEach var="tuesday" items="${tue}">
							
							<td>${tuesday.exerciseID}</td>
								 	
				 		</c:forEach>
				 	</tr>
				 	<tr>	
				 		<th>Wednesday</th>
				 		<c:forEach var="wednesday" items="${wed}">

							<td>${wednesday.exerciseID}</td>
									 	
					 	</c:forEach>
				 	</tr>
				 	<tr>
				 		<th>Thurtsday</th>
				 		<c:forEach var="thursday" items="${thu}">
							
							<td>${thursday.exerciseID}</td>
									 	
					 	</c:forEach>
				 	</tr>
				 	<tr>	
				 		<th>Friday</th>
				 		<c:forEach var="friday" items="${fri}">
							
							<td>${friday.exerciseID}</td>
									 	
					 	</c:forEach>
				 	</tr>	
				 	<tr>	
				 		<th>Saturday</th>
				 	</tr>
				 	<tr>
				 		<th>Sunday</th>
			 		</tr>			 	
				 	
				 </table>     
		 </c:when>
		 <c:otherwise>
		 	<h3>Workout database Missing!</h3>
		 </c:otherwise>
	</c:choose>
	</body>
</html>