package com.tasks;


public class BankProcessor {

	public static void main(String[] args) {

		BankAccount b=new BankAccount(1324256788,"Rajesh",55000.00);
		b.deposit(20000.00);
		b.withdraw(25000.00);
	}

}
