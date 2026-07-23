package com.tasks;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		System.out.println("=====Account Details=====");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolder);
		System.out.println("\nCurrent Balance: "+balance);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("\n=====After Deposit=====");
		System.out.println("Updated Balance: "+balance);
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("\n=====After Withdraw=====");
			System.out.println("Updated Balance: "+balance);
		}
		else {
			System.out.println("\nInsufficient balance");
		}
	}
	

}
