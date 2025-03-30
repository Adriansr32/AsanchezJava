package basic_objects;

public class BankAccount {
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("Insufficient funds!");
		}
	}
	
	public void checkBalance() {
		System.out.println("Current balance: " + this.balance);
	}
}
