<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup page</title>
</head>
<body>
<h2>Create Account Here</h2>
<form action = "saveData" method  = "post" >
<pre>
Name:     <input type ="text" name ="name" required />
Email:    <input type ="email" name ="email" required />
Password: <input type = "password" name = "password" required />
          <input type = "submit" value = "Save" style="background-color:blue; color:white;" />

</pre>

</form>
</body>
</html>