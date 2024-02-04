<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display page</title>
</head>
<body>
 <h2>Display Flights</h2>
 <h2>List of Flights</h2>
 
 <table border="">
 <thead>
 <tr>
 <th>Flight Number:</th>
 <th>OPeratingAirlines:</th>
 <th>DepartureCity:</th>
 <th>ArrivalCity:</th>
 <th>Date Of Departure</th>
 <th>Estimated Time of Departure:</th>
 <th>Select Flight</th>
 </tr>
 </thead>
 <c:forEach items="${findflights}" var ="findflights">
   <tbody>
     <tr> 
     <td>${findflights.flightNumber}</td>
     <td>${findflights.operatingAirlines}</td>
     <td>${findflights.departureCity}</td>
     <td>${findflights.arrivalCity}</td>
     <td>${findflights.dateOfDeparture}</td>
     <td>${findflights.estimatedDepartureTime}</td>
     <td><a href="showCompleteReservation?flightId=${findflights.id}">Select</a></td>
     </tr>
   </tbody>
   </c:forEach>
 
 </table>

</body>
</html>