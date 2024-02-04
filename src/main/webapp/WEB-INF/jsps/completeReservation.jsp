<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Complete Reservation</h2>

 <table border="">
 <thead>
 <tr>
 <th>Flight Number:</th>
 <th>OPeratingAirlines:</th>
 <th>DepartureCity:</th>
 <th>ArrivalCity:</th>
 <th>Date Of Departure</th>
 <th>Estimated Time of Departure:</th>
 </tr>
 </thead>
   <tbody>
     <tr> 
     <td>${flight.flightNumber}</td>
     <td>${flight.operatingAirlines}</td>
     <td>${flight.departureCity}</td>
     <td>${flight.arrivalCity}</td>
     <td>${flight.dateOfDeparture}</td>
     <td>${flight.estimatedDepartureTime}</td>
     </tr>
   </tbody>
 </table>
 <form action ="finalReservation" method="post">
 <h2>Enter Passenger Details</h2>
 <pre>
 Name:   <input type ="text" name = "name" />
 Email:  <input type = "email" name = "email" />
 Mobile: <input type = "number" name = "mobile" />
 <input type="hidden" name ="flightId" value="${flight.id}" />
 </pre>
 <h2>Enter Payment Details</h2>
 <pre>
 Name of Card: <input type = "text" name = "cardName" />
 Card Number:  <input type = "text" name ="cardNumber" />
 Cvv :         <input type = "text" name = "cvv" />
 Expiry Date:  <input type = "text" name = "expiryDate" />
 </pre>
 <input type ="submit" value ="Reservation" />
 </form>
</body>
</html>