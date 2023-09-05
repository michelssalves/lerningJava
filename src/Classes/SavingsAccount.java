package Classes;

public final class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	
	}
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}



	public void updateBalance() {
		
		balance += balance * interestRate;
		
	}
	
	@Override
	public void withDraw(double amount) {
		
		balance -= amount;
	}

}
