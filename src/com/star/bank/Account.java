package com.star.bank;

public class Account {
	String accountNumber;
	double balance;
	Bank bank = new Bank();
	boolean firstTime = true;
	public Account(String acctNum) {
		accountNumber = acctNum;
	}
	public Account(double bal, String accNum) {
		if(bal >= 100){
			balance = bal;
		}else {
			balance = 0;
		}
		accountNumber = accNum;
	}
	
	public void deposit(double howMuch) {
		double newBalance = balance + howMuch;
		balance = newBalance;
		System.out.println(howMuch+" was deposited, your new balance is: "+balance);
	}
	
	public void withdraw(double howMuch) {
		if(firstTime == true) {
			if(balance >=100) {
				double newBalance = balance -howMuch;
				balance=newBalance;
				
				System.out.println(howMuch+" has been withdraw. New balance is: "+balance +" first time: "+firstTime);
			}else {
				System.out.println("You don't have sufficeint balance for this transaction");
			}
			firstTime = false;
		}else {
			double transactionFee = bank.getTrasactionFee();
			double newBalance = balance - howMuch - transactionFee;
			if(newBalance >=100) {
				balance=newBalance;
				System.out.println(howMuch+" has been withdraw. New balance is: "+balance +" first time: "+firstTime);
			}else {
				System.out.println("You don't have sufficeint balance for this transaction ");
			}
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
