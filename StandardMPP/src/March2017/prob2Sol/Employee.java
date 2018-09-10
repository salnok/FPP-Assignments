package March2017.prob2Sol;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private List<Account> accountList = new ArrayList<>();

	public Employee(String name) {
		this.name = name;
	}

	public double computeUpdatedBalanceSum() {
		// implment

		double total = 0.0;

		for (Account acct : accountList)

			total += acct.computeUpdatedBalance();

		return total;

	}

	public void addAccount(Account acct) {
		this.accountList.add(acct);
	}

	public String getName() {
		return name;
	}

	public List<Account> getAccountList() {
		return accountList;
	}
}
