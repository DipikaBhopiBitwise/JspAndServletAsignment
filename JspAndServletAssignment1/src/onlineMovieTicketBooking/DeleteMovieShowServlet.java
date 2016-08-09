package onlineMovieTicketBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteMovieShowServlet
 */
//@WebServlet("/DeleteMovieShowServlet")
public class DeleteMovieShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovieShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession sess= request.getSession(false);
		if(sess != null)
		{
			int x=Integer.parseInt(request.getParameter("deletemovie"));
		    if(request.getParameter("deletemoviebutton")!=null)
		      {
		    	ListMovies m3 = (ListMovies)sess.getAttribute("list1");
		         m3.deletemovieshow(x);
		         out.println("Movie Deleted");
		         sess.setAttribute("list1",m3);
		        // out.println(m3);
		         request.getRequestDispatcher("DisplayAllShowsServlet").include(request, response);
			}
		    
		else
		{   
		out.println("You need to Login First");
		response.sendRedirect("LoginForm.jsp");
		}
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
