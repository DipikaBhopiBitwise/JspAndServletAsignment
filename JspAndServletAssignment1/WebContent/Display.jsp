<%@page import="java.io.PrintWriter"%>
<%@page import="onlineMovieTicketBooking.CustomerDetailsClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
Ticket Booked
<form action="TicketBooked.jsp" method="post"> 
<input type="submit" value="Back"> </form> 
<form action="LogoutServletTicket" method="post">
<input type="submit"  value="Logout">
</form>
</body>
</html>