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
 * Servlet implementation class TicketBookingServlet
 */
//@WebServlet("/TicketBookingServlet")
public class TicketBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketBookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		HttpSession sess= request.getSession(false);
		PrintWriter out = response.getWriter();
		
        CustomerDetailsClass md2=(CustomerDetailsClass) sess.getAttribute("mc");
       //System.out.println(md2.getCustomername());
      //  request.setAttribute("md2", md2);
	    	
		if(sess != null)
		{
		   if(request.getParameter("proccedtoticket")!= null && sess.getAttribute("custlist") == null)
		      {
			   { 
				   CheckCustomerDetails m1=new CheckCustomerDetails();
			          m1.setValues(md2);
			    	  m1.addToCustomerMap();
			    	  out.println("Ticket Booked");
			    	   sess.setAttribute("custlist", m1);
				       request.getRequestDispatcher("Display.jsp").include(request, response);

			      }
		      }
		    
		   else
		   {
			   
			   if(request.getParameter("proccedtoticket")!= null)
			   {
				  // System.out.println("abcd");
				   CheckCustomerDetails m2 = (CheckCustomerDetails)sess.getAttribute("custlist");
			        m2.setValues(md2);
			      m2.addToCustomerMap();
			       
	    	        out.println("Show Booked");
	    	        sess.setAttribute("custlist", m2);
				   request.getRequestDispatcher("Display.jsp").include(request, response);
				    
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
