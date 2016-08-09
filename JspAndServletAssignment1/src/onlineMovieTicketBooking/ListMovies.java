package onlineMovieTicketBooking;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ListMovies {
	
	HashMap<Integer,MovieDetails> add=  new HashMap<Integer,MovieDetails>();
	private HttpServletRequest request;
//	HttpServletRequest req=(HttpServletRequest)request;
//	HttpSession session= req.getSession(false);
	public int size = 1;
	MovieDetails movieDetails;
	public void deletemovieshow(int x)
	{
		add.remove(x);
		size--;
	}
	public void setValues(MovieDetails m)
	{
		this.movieDetails=m;
	}
	
	public HashMap<Integer,MovieDetails> getList()
	{
		return add;
	}
//	movieshow.add(new MovieDetails(movienameC));
//	movieshow.add(theaternameC);
//	movieshow.add(starttimeC);
//	movieshow.add(endtimeC);
//	movieshow.add(seatsavailableC);
	
	
	public ListMovies() {
		// TODO Auto-generated constructor stub
	}
	


	public boolean addToMap()
	{   
	if(size<=2)
	  { 
		add.put(size, movieDetails);
	//	System.out.println(add);
		size++;
		return true;
	  }
	 else return false;
	
	}
	
	public int returnsize()
	{
		return size;
	}


//	@Override
//	public String toString() {
//		return "ListMovies [add=" + add + "]";
//	}

	

	
	
	}
