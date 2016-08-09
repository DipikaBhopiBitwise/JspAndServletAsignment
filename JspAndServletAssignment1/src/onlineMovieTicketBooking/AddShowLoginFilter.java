package onlineMovieTicketBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class BookingLoginFilter
 */
//@WebFilter("/BookingLoginFilter")
public class AddShowLoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AddShowLoginFilter() {
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
		HashMap<String,String> LoginDetails=new HashMap<String,String>();
		 response.setContentType("text/html");
		 LoginDetails.put("Rajesh","123");
		 LoginDetails.put("Ria","123");
		 LoginDetails.put("Ninad","123");
		 LoginDetails.put("Chintan","123");
		String Userid=request.getParameter("username");
		String password=request.getParameter("pswrd");
		PrintWriter pr = response.getWriter();
		if(Userid!=null && password !=null)
		    {if(LoginDetails.containsKey(Userid)&& password.equals(LoginDetails.get(Userid)) )
		    {
	     chain.doFilter(request, response);
		     }
		 else
		 {  pr.write("LogIn Failed InValid Credentials");
			 request.getRequestDispatcher("LoginForm.jsp").include(request, response);
		     
			//rs.sendRedirect("Form.html");
		 }}
		else
		{
			pr.write("Login First");
			 request.getRequestDispatcher("LoginForm.jsp").include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
