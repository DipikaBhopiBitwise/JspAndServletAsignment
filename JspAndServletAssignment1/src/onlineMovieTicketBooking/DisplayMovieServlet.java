package onlineMovieTicketBooking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayMovieServlet
 */
//@WebServlet("/DisplayMovieServlet")
public class DisplayMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println(request.getParameter("addShow"));
//		System.out.println(request.getParameter("display"));
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String movienameC= request.getParameter("moviename");
		String theaternameC= request.getParameter("theatername");
		String starttimeC= request.getParameter("starttime");
		String endtimeC= request.getParameter("endtime");
		String seatsavailableC= request.getParameter("seatsavailable");
		MovieDetails md = new MovieDetails();
		md.setMovienameC(movienameC);
		md.setTheaternameC(theaternameC);
		md.setStarttimeC(starttimeC);
		md.setEndtimeC(endtimeC);
		md.setSeatsavailableC(seatsavailableC);
	HttpSession sess= request.getSession(false);	
		if(sess != null)
		{
		   if(request.getParameter("addShow")!= null && sess.getAttribute("list1") == null)
		         { 
			         ListMovies m1=new ListMovies();
			          m1.setValues(md);
			    	  m1.addToMap();
			    	  out.println("Show Added");
			    	   sess.setAttribute("list1", m1);
				       request.getRequestDispatcher("WelcomeUser.jsp").include(request, response);

			      }
			    
		   else
		   {
			   
			   if(request.getParameter("addShow")!= null)
			   {
				   System.out.println("abcd");
			      ListMovies m2 = (ListMovies)sess.getAttribute("list1");
			      m2.setValues(md);
			      if(m2.addToMap())
			       {
	    	        out.println("Show Added");
	    	        sess.setAttribute("list1", m2);
				   request.getRequestDispatcher("WelcomeUser.jsp").include(request, response);
				    }
			     else
			     {
				    request.getRequestDispatcher("ShowFullError.jsp").include(request, response);
			     } 
			      }
		   }
		}

		else
		{   out.println("You need to Login First");
			response.sendRedirect("LoginForm.jsp");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		}
	}
				


