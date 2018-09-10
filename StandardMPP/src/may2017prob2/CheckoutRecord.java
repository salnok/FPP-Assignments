package may2017prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
	private List<CheckoutRecordEntry> checkoutrec=new ArrayList<>();
	
	
	public List<CheckoutRecordEntry> getCheckoutrec() {
		return checkoutrec;
	}


	void addCheckoutEntry(CheckoutRecordEntry entry){
		this.checkoutrec.add(entry);
		
	}
	
	
}
