<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Justeat Pizza</title>
</head>
<body>
<sf:form action="order"  modelAttribute="userBean1"  method="post">
<table>

<tr>
<td>Name of Customer</td><td><sf:input path="customername"/></td></tr>
<tr><td>Address </td><td><sf:textarea path="address"/></td></tr>
<tr><td>Phone Number</td><td><sf:input path="phoneno"/></td></tr>
<tr><td>Scheduled date</td><td><input type="date" ></td></tr>
<tr><td>Enter Preferred Topping</td><td><sf:select path="topping">
<sf:option value="30">Capsicum</sf:option>
<sf:option value="50">Mushroom</sf:option>
<sf:option value="70">Jalapeno</sf:option>
<sf:option value="85">Paneer</sf:option></sf:select></td></tr></table><br><br>
<input type="submit" value="Order"></sf:form><br><br>
<a href="backtohome" >Home</a>
&nbsp; &nbsp; <a href="exit">Exit</a>
</body>
</html>