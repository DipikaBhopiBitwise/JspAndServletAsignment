package onlineMovieTicketBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomerDetailTag extends SimpleTagSupport{
	public void doTag() throws JspException, IOException
	{
		PageContext pageContext=(PageContext)getJspContext();
		HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
		HttpServletResponse resp=(HttpServletResponse)pageContext.getResponse();
		HttpSession sess=pageContext.getSession();
		CheckCustomerDetails m2 = (CheckCustomerDetails)sess.getAttribute("custlist");
		if(m2==null)
		{}
		else
		{
			PrintWriter writer=resp.getWriter();
			HashMap<Integer,CustomerDetailsClass> h= m2.getCustomerDetails();
			JspWriter out=pageContext.getOut();
			out.write("<html>");
			out.write("<head>");
			out.write("</head>");
			out.write("<body>");
			out.write("<table>");
			for(CustomerDetailsClass c:h.values())
			{
				out.write("<tr>");
	        	out.write("<td>");
	        	out.write(c.getCustomername());
	        	out.write("</td>");
	        	out.write("<td>");
	        	out.write(c.getCustomeraddress());
	        	out.write("</td>");
	        	out.write("<td>");
	        	out.write(c.getCustomercontact());
	        	out.write("</td>");
//	        	out.write("<td>");
//	        	out.write(c.getDateofshow());
//	            out.write("</td>");
	            out.write("<td>");
	            out.write(c.getMname());
	            out.write("</td>");
	            out.write("<td>");
	            out.write(c.getNoofseatstobebooked());
	            out.write("</td>");
	            out.write("</tr>");	
			}
            out.write("</body>");
			out.write("</table>");
		}
	}
}
