<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color:pink;
text-align:center;
font-size:35px;
color:blue;
}
a{
font-size:20px;
color:green;
text-align:left;}</style>
</head>
<body>
Welcome ${userBean.username}

<br><br>
<a href="placeorder">Place Order</a><br>
<a href="displayorder">Display Order</a><br>
<a href="modifyorder">Modify Order</a><br>
<a href="deleteorder">Delete Order</a><br>
<a href="exit">Exit</a>
</body>
</html>