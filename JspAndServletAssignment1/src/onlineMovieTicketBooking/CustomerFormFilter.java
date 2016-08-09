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
 * Servlet Filter implementation class CustomerFormFilter
 */
@WebFilter("/CustomerFormFilter")
public class CustomerFormFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CustomerFormFilter() {
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
		String cname = request.getParameter("customername"); 
		String addr = request.getParameter("customeraddress"); 
		String contact = request.getParameter("customercontact"); 
		
		String nseats = request.getParameter("noofseatstobebooked"); 
		ValidatorClass v1 = new ValidatorClass();
		if(v1.checkName(cname)&& v1.checkAddress(addr)&& v1.checkPhone(contact) )
		{
			chain.doFilter(request, response);
		}
		else
		{
			response.setContentType("text/html");
			out.println("You must have left the field empty or entered incorrect format!");
			out.println("Enter your details again!");
			request.getRequestDispatcher("CustomerForm.jsp").include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
