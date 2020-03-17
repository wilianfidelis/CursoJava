package application;

import java.security.DomainLoadStoreParameter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
		
				account.withdraw(amount);
				System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
			}
			catch (DomainException e) {
				System.out.println("Withdraw error: " + e.getMessage());
			}catch (InputMismatchException e) {
				System.out.println("ERRO");
			}
	
		sc.close();

	}

}
