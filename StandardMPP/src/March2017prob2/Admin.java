package March2017prob2;

import java.util.List;


public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalUpdatedBalance=0.0;
		for(Employee emp:list)
			for(Account act:emp.getAcct())
				totalUpdatedBalance+=act.computeUpdateBalance();
				
		return totalUpdatedBalance;
	}
}
