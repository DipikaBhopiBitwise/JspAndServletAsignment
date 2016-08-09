<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin</title>
</head>
<body>
<form action="DisplayMovieServlet" method="post">
<h2>Welcome!!!</h2>
Enter the Movie Name:<input type="text" name="moviename">
Enter the Theater Name:<input type="text" name="theatername">
Enter the Start Time:<input type="text" name="starttime">
Enter the End Time:<input type="text" name="endtime">
Enter the Seats Available:<input type="number" name=seatsavailable>

<input type="submit" name="addShow" value="Add"></form>
<form action="Home.jsp" method="post">
<input type="submit"  value="Back">
</form>

<form action="DisplayAllShowsServlet" method="post">
<input type="submit"  value="Display All Movie Shows">
</form>
<form action="Home.jsp" method="post">
<input type="submit"  value="Back"></form>
<form action="LogoutServletTicket" method="post">
<input type="submit"  value="Logout"></form>
<!-- <a href="http://localhost:8086/JspandServletAssignment/DisplayAllShowsServlet">Display All Movie Shows</a> -->
<%-- <jsp:useBean id="moviedetails" class="onlineMovieTicketBooking.MovieDetails" scope="session"></jsp:useBean> --%>
<%--     <jsp:setProperty property="*" name="moviedetails"/> --%>


</body>
</html>