package tests;

import basic_objects.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount banco1 = new BankAccount("Adrian", 1000);
		
		banco1.deposit(500);
		banco1.withdraw(300);
		banco1.checkBalance();
	}

}
