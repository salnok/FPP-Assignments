package may2017prob2;

public class LibraryMember {
	private String memberid;
	private String firstName;
	private String lastName;
	private String phone;
	
	private CheckoutRecord checkoutrecord;
	
	public LibraryMember(String memberid, String firstName, String lastName, String phone) {
		this.memberid = memberid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemberid() {
		return memberid;
	}

	

	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}

	

	public String getPhone() {
		return phone;
	}

	

	public CheckoutRecord getCheckoutrecord() {
		return checkoutrecord;
	}

	public void setCheckoutrecord(CheckoutRecord checkoutrecord) {
		this.checkoutrecord = checkoutrecord;
	}
	
}
