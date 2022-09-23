<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form style="width:40%;
	height:250px;
	background-color:#9da6f7;
	border:1px solid black;
	padding:50px;" action="login" method=post>
<h2 style="color:#0000a0;
	align:center;">Login Form</h2>
<label>Employee Id : </label>
<input type="text" name="empid" placeholder="Enter the Employee Id">
</br>
<br>
<label>Employee name : </label>
<input type="text" name="empname" placeholder="Enter the Employee name">

<br>
<br>
<input style="background-color:green;color:white;" type="submit" value="Login">
<br>
<br>
<p>If you are new Employee first <a href="signup.jsp">Register here</a></p>
</form>

</body>
</html>