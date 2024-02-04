<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<h2>Login Here</h2>
<form action = "verifylongin" method ="post" >
<pre> 
UserName: <input type = "text" name = "email" required/>
Password: <input type = "password" name = "password" required /> 
<input type = "submit" value = "Login" />
<h4 style="color:red;">${error}</h4>
</pre>
</form>
</body>
</html>