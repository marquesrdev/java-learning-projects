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
		if(value != 0.0) {
			setBalance(value);
			setTransaction(value);
			System.out.println(value + " deposited in your account.");
		}
	}
	
	// Method: money withdraw.
	void withdraw(double value) {
		if(value != 0.0) {
			setBalance(-value);
			setTransaction(-value);
			System.out.println(value + " withdrawn from your account.");
		}
	}
	
	// Method: estimate investment results
	
	// Method: display options menu
	
	// Method: show transactions history. TODO: add display text here(or in the get method)
	void transactionsHistory() {
		getTransactions();
	}

	public void getBalance() {
		System.out.println("Current Balance: " + balance);
	}

	public void setBalance(double value) {
		this.balance += value;
	}

	public void getTransactions() {
		if(!transactions.isEmpty()) {
			transactions.forEach(System.out::println);			
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
