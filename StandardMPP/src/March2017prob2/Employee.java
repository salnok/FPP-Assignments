package March2017prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> acct = new ArrayList<>();
	
	public List<Account> getAcct() {
		return acct;
	}


	public void addAccount(Account acct){
		this.acct.add(acct);
	}
	
	public String getName() {
		return name;
	}

	public double computeUpdatedBalanceSum() {
		//implement
		return 0.0;
	}
}
