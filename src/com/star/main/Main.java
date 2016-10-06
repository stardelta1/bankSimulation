package com.star.main;

import Game.GuessGame;
import Helper.InputHelper;

import com.star.bank.Account;
import com.star.bank.Bank;
import com.star.bank.Customer;


public class Main {

	public static void main(String[] args) {
		int noOfCustomers = 0;
		Bank bank = new Bank();
		Customer[] customers = bank.getCustomer();
		while (true) {
			System.out.println("Please enter your choice");
			System.out.println("1: Create Account");
			System.out.println("2: Deposit");
			System.out.println("3: Withdraw");
			System.out.println("4: Check Balance");
			System.out.println("5: Calculate Interest");
			System.out.println("6: Exit");
			System.out.println("0: Play a guess game");
			
			int choice = Integer.parseInt(InputHelper.getInput());
			switch (choice) {
			case 1:
				System.out.println("Creating account for new customer");
				System.out.println("Enter account opening amout: ");
				double initialAmount = Double.parseDouble(InputHelper.getInput());
				System.out.println("Enter Account number: ");
				String acctNumber = InputHelper.getInput();
				Account account = new Account(initialAmount, acctNumber);
				System.out.println("Enter Account name: ");
				String acctName = InputHelper.getInput();
				Customer newCustomer = new Customer(acctName, account);
				customers[noOfCustomers] = newCustomer;
				noOfCustomers++;
				newCustomer.display();
				break;
			case 2:
				System.out.println("Enter account number: ");
				acctNumber = InputHelper.getInput();
				if(noOfCustomers == 0) {
					System.err.println("Account number not found");
				}else {
					boolean found = false;
					for(int i =0; i < noOfCustomers; i++) {
						Account tempAccount = customers[i].getAccount();
						String tempAcctNum = tempAccount.getAccountNumber();
						if(acctNumber.equals(tempAcctNum)) {
							System.out.println("Enter amount to deposit: ");
							double amount = Double.parseDouble(InputHelper.getInput());
							tempAccount.deposit(amount);
							found = true;
						}
					}
					if(found == false) {
						System.err.println("Account number was not found");
					}
				}
				break;
			case 3:
				System.out.println("Enter account number: ");
				acctNumber = InputHelper.getInput();
				if(noOfCustomers == 0) {
					System.err.println("Account number not found");
				}else {
					boolean found = false;
					for(int i =0; i < noOfCustomers; i++) {
						Account tempAccount = customers[i].getAccount();
						String tempAcctNum = tempAccount.getAccountNumber();
						if(acctNumber.equals(tempAcctNum)) {
							System.out.println("Enter amount to withdraw: ");
							double amount = Double.parseDouble(InputHelper.getInput());
							tempAccount.withdraw(amount);
							found = true;
						}
					}
					if(found == false) {
						System.err.println("Account number was not found");
					}
				}
				break;
			case 4:
				System.out.println("Enter account number: ");
				acctNumber = InputHelper.getInput();
				if(noOfCustomers == 0) {
					System.err.println("Account number not found");
				}else {
					boolean found = false;
					for(int i =0; i < noOfCustomers; i++) {
						Account tempAccount = customers[i].getAccount();
						String tempAcctNum = tempAccount.getAccountNumber();
						if(acctNumber.equals(tempAcctNum)) {
							double currentBalance = tempAccount.getBalance();
							System.out.println("Your current balance is: "+currentBalance);
							found = true;
						}
					}
					if(found == false) {
						System.err.println("Account number was not found");
					}
				}
				break;
			case 5:
				System.out.println("Enter account number: ");
				acctNumber = InputHelper.getInput();
				if(noOfCustomers == 0) {
					System.err.println("Account number not found");
				}else {
					boolean found = false;
					for(int i =0; i < noOfCustomers; i++) {
						Account tempAccount = customers[i].getAccount();
						String tempAcctNum = tempAccount.getAccountNumber();
						if(acctNumber.equals(tempAcctNum)) {
							bank.calculateInterest(customers[i]); 
							found = true;
						}
					}
					if(found == false) {
						System.err.println("Account number was not found");
					}
				}
				break;
			case 6:
				System.out.println("Exited!");
				System.exit(0);
				break;
			case 0:
				GuessGame game = new GuessGame();
				game.guessNumber();
				break;
			default:
				System.out.println("Choose a valid number");
				break;
			}
		}
		
		
	}
}
