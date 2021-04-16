package learning.projects.lp1;

import java.util.ArrayList;

public class Account {
	// Class variables
	private double balance;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	private int clientID;
	private String clientName;

	// Class constructor
	Account(String cname, int cid) {
		setClientID(cid);
		setClientName(cname);
	}

	// Method: money deposit.
	void deposit(double value) {
		if (value != 0.0) {
			setBalance(value);
			setTransaction(value);
			System.out.println(value + " deposited in your account.");
		}
	}

	// Method: money withdraw.
	void withdraw(double value) {
		if (value != 0.0) {
			setBalance(-value);
			setTransaction(-value);
			System.out.println(value + " withdrawn from your account.");
		}
	}

	// Method: simulate investment results
	public void investimentSimulation(int years, int compoundYearly, Double value, Double interestRate) {
		Double rate = interestRate / 100;
		Double investmentTotalResult = value * Math.pow(1 + (rate / compoundYearly), compoundYearly * years);
		Double investmentValueResult = investmentTotalResult - value;
		System.out.println("Investing " + value + " at a " + interestRate + "%/year interest rate during " + years
				+ " year(s) results in:");
		System.out.println("Investiment return value: " + investmentValueResult);
		System.out.println("Total amount after investment: " + investmentTotalResult);
	}

	// Method: display options menu

	public void getBalance() {
		System.out.println("Current Balance: " + balance);
	}

	public void setBalance(double value) {
		this.balance += value;
	}

	public void getTransactions() {
		System.out.println("Transaction history:");
		if (!transactions.isEmpty()) {
			transactions.forEach(System.out::println); // Introduced in Java 8, this uses Lambda and method reference.
														// Learn more about it!
			// It could have been done like this
			// for (Double transaction : transactions) {
			// System.out.println(transaction);
			// }
		} else {
			System.out.println("No transactions found!");
		}
	}

	public void setTransaction(double value) {
		this.transactions.add(value);
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
}
