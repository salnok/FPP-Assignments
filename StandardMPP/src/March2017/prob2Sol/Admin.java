package March2017.prob2Sol;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		// implement

		double totalUpdatedBalance = 0;
		for (Employee e : list) {
			totalUpdatedBalance += e.computeUpdatedBalanceSum();
		}
		return totalUpdatedBalance;
	}
}

// for(Employee e:list){
// for (Account a:e.getAccountList()) {
// totalUpdatedBalance+= a.computeUpdatedBalance();
// }}
// return totalUpdatedBalance;
// }}
