package com.star.bank;

public class Bank {
	
	private double TRANSACTION_FEE = 10.0; 
	private double INTEREST = 3;
	public Customer[] customer = new Customer[1000];
	
	public void calculateInterest(Customer customer) {//Ask which customer
		Account account = customer.getAccount();
		double balance = account.getBalance();
		double interestAmount = balance * getInterestRate();
		double totalBalance = balance + interestAmount;
		System.out.println("interest amount is "+ interestAmount+". Total after adding interest: "+totalBalance);
	}
	public double getInterestRate() {
		return INTEREST/100;
	}
	public double getInterest() {
		return INTEREST;
	}
	public double getTrasactionFee() {
		return TRANSACTION_FEE;
	}
	public Customer[] getCustomer() {
		return customer;
	}
	
}
