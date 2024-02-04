<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight page</title>
</head>
<body>
<h2>Find Flights Here</h2>
<form action = "findflights" method="post">
Form: <input type = "text" name = "from" />
To: <input type = "text" name = "to" />
Departure Date: <input type = "text" name = "dateOfDeparture" />
<input type = "submit"  value = "Search" />


</form>
</body>
</html>