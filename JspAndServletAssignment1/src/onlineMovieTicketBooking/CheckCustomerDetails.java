package onlineMovieTicketBooking;

import java.util.HashMap;

public class CheckCustomerDetails {
	int totalNumberOfSeats=0;
	HashMap<Integer,CustomerDetailsClass> hc= new HashMap<Integer,CustomerDetailsClass>();
	public int sizec=1;
	CustomerDetailsClass customerDetails;
	
	 public void getMovieDetails(HashMap<Integer,MovieDetails> hm, String movieName)
     {   
    	 for(MovieDetails m: hm.values())
 		{
 			if(m.getMovienameC().equals(movieName))
 			{
 				totalNumberOfSeats=Integer.parseInt(m.getSeatsavailableC());
 				break;
 			}
 		}
     } 	
//     public void setMovieDetails(HashMap<Integer,MovieDetails> hm,String movieName,int c)
//     {   
//    	 for(MovieDetails m: hm.values())
// 		{
// 			if(m.getMovienameC().equals(movieName))
// 			{
// 				m.setSeatsavailableC("c");
// 				break;
// 			}
// 		}
//     } 	
	public boolean checkavailabilityofSeats(int seats) 
	{
		if(seats<=totalNumberOfSeats)
		{
			//totalNumberOfSeats =- seats;
			//setMovieDetails( hm,movieName,totalNumberOfSeats);
            return true;
		}
		else return false;
		
	}
	public void setValues(CustomerDetailsClass m)
	{
		this.customerDetails=m;
	}
	public boolean addToCustomerMap()
	{   

		hc.put(sizec, customerDetails);
	//	System.out.println(add);
		sizec++;
		return true;
	 
	
	}
	public HashMap<Integer, CustomerDetailsClass> getCustomerDetails() {
		// TODO Auto-generated method stub
		return hc;
	}
	

}
