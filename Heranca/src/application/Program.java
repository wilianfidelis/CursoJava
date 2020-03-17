package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withDraw(200.00);
		System.out.println(acc.getBalance());
		
		SavingsAccount acc2 = new SavingsAccount(1002, "Wilian", 1000.00, 4.0);
		acc2.withDraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1004, "Bruno", 1000.0, 500.0);
		acc3.withDraw(200.00);
		System.out.println(acc3.getBalance());
		
		// UPCASTING
		
	
		

	}

}
