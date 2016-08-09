package onlineMovieTicketBooking;

public class CustomerDetailsClass {
	private String customername,customeraddress,customercontact,dateofshow,noofseatstobebooked,mname;

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
		//System.out.println(" "+customername);
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public String getCustomercontact() {
		return customercontact;
	}

	public void setCustomercontact(String customercontact) {
		this.customercontact = customercontact;
	}

	public String getDateofshow() {
		return dateofshow;
	}

	public void setDateofshow(String dateofshow) {
		this.dateofshow = dateofshow;
	}

	public String getNoofseatstobebooked() {
		return noofseatstobebooked;
	}

	public void setNoofseatstobebooked(String noofseatstobebooked) {
		this.noofseatstobebooked = noofseatstobebooked;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

}
