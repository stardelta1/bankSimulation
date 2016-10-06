package com.star.bank;

public class Customer {
	public String name;
	Account account;
	public Customer(String nm, Account acct) {
		name = nm;
		account = acct;
	}
	
	public void display() {
		System.out.println("Account Name: "+ name +" Account Number: "+account.getAccountNumber()+" Balance: "+account.getBalance()+"\n");
	}
	public String getName() {
		return name;
	}
	public Account getAccount() {
		return account;
	}
}
