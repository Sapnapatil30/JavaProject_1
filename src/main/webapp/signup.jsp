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
	padding:50px;" action="register" method=post>
<h1 style="color:#0000a0;
	align:center;">Registration Form</h1>
<label>Employee Id : </label>
<input type="number" name="empid" placeholder="Enter the Employee Id">
</br>
<br>
<label>Employee Name : </label>
<input type="text" name="empname" placeholder="Enter the Employee Name">
<br>
<br>
<label>Contact : </label>
<input type="number" name="contact" placeholder="Enter the contact number">
<br>
<br>
<label>Email : </label>
<input type="email" name="email" placeholder="Enter the email Id">
<br>
<br>
<input style="background-color:green;color:white;" type="submit" value="Sign-up">
</form>
</body>
</html>