package onlineMovieTicketBooking;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerDetailServlet
 */
@WebServlet("/CustomerDetailServlet")
public class CustomerDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession(false);
		String noofSeatsNeeded=request.getParameter("noofseatstobebooked");
		String mname=request.getParameter("mname");
		String customername= request.getParameter("customername");
		String customercontact= request.getParameter("customercontact");
		String customeraddress= request.getParameter("customeraddress");
		CustomerDetailsClass md = new CustomerDetailsClass();
		md.setCustomername(customername);
		md.setMname(mname);
		md.setNoofseatstobebooked(noofSeatsNeeded);
		md.setCustomeraddress(customeraddress);
		md.setCustomercontact(customercontact);
		sess.setAttribute("mc", md);
		
		ListMovies m4 = (ListMovies)sess.getAttribute("list1");
		HashMap<Integer,MovieDetails> hm= m4.getList();
		CheckCustomerDetails c1 =new CheckCustomerDetails();
		c1.getMovieDetails(hm,mname);
		//HashMap<Integer,CustomerDetailsClass> hm1;
		int noofseatsreq =Integer.parseInt(noofSeatsNeeded);
		if(c1.checkavailabilityofSeats(noofseatsreq))
		{
			
			request.getRequestDispatcher("TicketBooked.jsp").include(request, response);
		}
		else
		{
			request.getRequestDispatcher("NoSeats.jsp").include(request, response);
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
