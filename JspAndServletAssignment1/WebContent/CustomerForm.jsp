<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="m" uri="/WEB-INF/customer.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<form action="CustomerDetailServlet" method="post">  
Customer Name:<input type="text" name="customername"><br>  
Customer Address:<input type="text" name="customeraddress"><br> 
Customer Phone:<input type="number" name="customercontact"><br>
Movie Show :<m:MovieTag/>
Date:<input type="date" name="dateofshow"><br>   
No of seats to be booked:<input type="number" name="noofseatstobebooked"><br>   
<input type="submit" value="Book Show">  
</form>
<form action="DislplayBookingHistory.jsp" method="post">
<input type="submit"  value="Show  History"></form>
<form action="Home.jsp" method="post">
<input type="submit"  value="Back"></form>
<form action="LogoutServletTicket" method="post">
<input type="submit"  value="Logout"></form>
 

</body>
</html>