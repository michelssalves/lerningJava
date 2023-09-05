package App;

import Classes.Account;
import Classes.BusinessAccount;
import Classes.SavingsAccount;

public class appBanco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(1001, "Michel", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Carlos", 0.0, 1000.0); 
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Vera", 1000.0, 0.01);
		Account acc3 = new SavingsAccount(1004, "Maravi", 1000.0, 0.01);
		Account acc6 = new SavingsAccount(1005, "Vera", 1000.0, 0.01);
		Account acc7 = new BusinessAccount(1006, "Mayumi", 1000.0, 500.0);

		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//da erro no tempo de execucao
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount){
			
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
		}

		if(acc3 instanceof SavingsAccount){
			
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
		}
		
		acc.withDraw(200.0);
		System.out.println(acc.getBalance());
		

		acc6.withDraw(200.0);
		System.out.println(acc6.getBalance());
		
		acc7.withDraw(200.0);
		System.out.println(acc7.getBalance());
		
		
	}

}
