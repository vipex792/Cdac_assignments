<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "validateuser" method = "post"> 
UserName : <input type = "text" name="uname" id="unm"><br/>
Password : <input type = "text" name="pass" id="pass"><br/>
<button type = "submit" name= "login" id = "login">Login</button>
</form>
<a href = "register.jsp">register me?</a>
<a href = "forgotpassword.html">forgot password?</a>
</body>
</html>