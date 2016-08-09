package onlineMovieTicketBooking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class WelcomeUserFilter
 */
@WebFilter("/WelcomeUserFilter")
public class WelcomeUserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public WelcomeUserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String mname = request.getParameter("moviename"); 
		String tname = request.getParameter("theatername"); 
		String seats = request.getParameter("seatsavailable"); 
		String stime = request.getParameter("starttime"); 
		String etime = request.getParameter("endtime"); 
		ValidatorClass v = new ValidatorClass();
		if(v.checkName(mname)&& v.checkName(tname)&& v.checkTime(stime))
		{
			chain.doFilter(request, response);
		}
		else
		{
			response.setContentType("text/html");
			out.println("You must have left the field empty or entered incorrect format!");
			out.println("Enter your details again!");
			request.getRequestDispatcher("WelcomeUser.jsp").include(request, response);
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
