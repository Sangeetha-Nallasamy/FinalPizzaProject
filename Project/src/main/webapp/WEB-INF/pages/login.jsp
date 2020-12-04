<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Justeat Pizza</title>
</head>
<body>
<sf:form action="logincheck"  modelAttribute="userBean"  method="post">
	

UserName:<sf:input path="username"/>
   <br> <br>  

Password:<sf:password path="password"/>
   	<br><br>  
	<input type="submit" value="Submit" /><br />

</sf:form>
</body>
</html>