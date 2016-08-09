<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="cd" uri="/WEB-INF/customer.tld"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
All tickets added
<cd:CustomerDetailTag/>
<form action="LogoutServletTicket" method="post">
<input type="submit"  value="Logout"></form>
<form action="CustomerForm.jsp" method="post">
<input type="submit"  value="Back"></form>
</body>
</html>