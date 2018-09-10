package March2017prob2;

public class checkingAccount extends Account{

	private String acctId;
	private double monthlyFee;
	private double balance;
	
	
	
	public checkingAccount(String acctId, double fee, double startBalance) {
		super();
		this.acctId = acctId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}

	@Override
	String getAccountID() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	Double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	Double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return balance-monthlyFee;
	}

}
