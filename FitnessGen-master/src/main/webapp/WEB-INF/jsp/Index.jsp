<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Main side where user either signs in or signs up if he doesn't -->
<!-- have an account                                                -->
<html lang="en">
    <head>
        <title>Main Page</title>
    </head>
    
    <body>
    	<h1>Fitness Generator!!!</h1>
    	<p>Are you a newcomer or a regular?</p>
    	<table>
    		<tr>
    			<td><a href="/signup">Newcomer</a></td>
    			<td><a href="/signin">Regular</a></td>
    		</tr>
    	</table>
    </body>
</html>
