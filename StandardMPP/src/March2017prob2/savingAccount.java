package March2017prob2;

public class savingAccount extends Account {

	private String acctid;
	private double interestRate;
	private double balance;
	
	@Override
	String getAccountID() {
		// TODO Auto-generated method stub
		return acctid;
	}

	@Override
	Double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	Double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}

}
