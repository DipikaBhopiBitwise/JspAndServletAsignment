<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--  <jsp:useBean id="customerdetails" class="onlineMovieTicketBooking.CustomerDetailsClass" scope="session"></jsp:useBean>  --%>
<%--     <jsp:setProperty property="*" name="customerdetails"/> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket Book</title>
</head>
<body>
Tickets Available
<form action="TicketBookingServlet" method="post">
<input type="submit" name="proccedtoticket" value="Proceed">
 
</form>
<form action="CustomerForm.jsp" method="post"> 
<input type="submit" value="Back">  
</form>
<form action="LogoutServletTicket" method="post">
<input type="submit"  value="Logout"></form>

</body>
</html>