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

import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet implementation class DisplayAllShowsServlet
 */
//@WebServlet("/DisplayAllShowsServlet")
public class DisplayAllShowsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllShowsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess= request.getSession(false);
		if(sess !=null)
		{ ListMovies m3 = (ListMovies)sess.getAttribute("list1");
		 HashMap<Integer,MovieDetails> mt = m3.getList();
		 PrintWriter out = response.getWriter();
		 out.write("<html>");
		 out.write("<head>");
		 out.write("<title>Online movie ticket booking</title>");
		 out.write("</head>");
		 out.write("<body>");
		 out.write("<form>");
		 out.write("<b><h2>All Movie Shows</h2></b>");
		 out.write("<table border=\"1px\">");
		 out.write("<tr>");
		 out.write("<th>");
		 out.write("Serial No:");
		 out.write("</th>");
		 out.write("<th>");
		 out.write("Movie name");
		 out.write("</th>");
		 out.write("<th>");
		 out.write("Theater name");
		 out.write("</th>");
		 out.write("<th>");
		 out.write("Start time");
		 out.write("</th>");
		 out.write("<th>");
		 out.write("End time");
		 out.write("</th>");
         out.write("<th>");
         out.write("Total seats");
         out.write("</th>");
         out.write("</tr>");
         int x=0;
         
         int[] var=new int[mt.size()];
         for(Integer yo:mt.keySet())
         {
        	 var[x]=yo;
        	 x++;
   
         }
        int y=0; 
        for(MovieDetails movie : mt.values())
        { 
        	out.write("<tr>");
        	out.write("<td>");
        	out.write(""+(var[y]));
        	out.write("</td>");
        	out.write("<td>");
        	out.write(movie.getMovienameC());
        	out.write("</td>");
        	out.write("<td>");
        	out.write(movie.getTheaternameC());
        	out.write("</td>");
        	out.write("<td>");
        	out.write(movie.getStarttimeC());
        	out.write("</td>");
        	out.write("<td>");
        	out.write(movie.getEndtimeC());
            out.write("</td>");
            out.write("<td>");
            out.write(movie.getSeatsavailableC());
            out.write("</td>");
            out.write("</tr>");
           y++;
           
            }
        
         out.write("</form>");
            out.write("<form action=\"DeleteMovieShowServlet\" method=\"post\">");
            out.write("<input type=\"number\" name=\"deletemovie\">");
            out.write("<input type=\"submit\" name=\"deletemoviebutton\" value=\"delete\">");
            out.write("</form>");
            out.write("<form action=\"WelcomeUser.jsp\" method=\"post\">");
           // out.write("<input type=\"number\" name=\"deletemovie\">");
           out.write("<input type=\"submit\"  value=\"Back\">");
           out.write("</form>");
            out.write("</body>");
            
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
