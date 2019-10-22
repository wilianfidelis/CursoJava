package entites;

public class Product {

	private String holder;
	private int number;
	private double balance;
	
/*---------------- Construtor ----------------------*/	
	public Product(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Product(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
/*----------------- Get Set---------------------------*/
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
/*--------------------------------------------*/
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", TITULAR: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
