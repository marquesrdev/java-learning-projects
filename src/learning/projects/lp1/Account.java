package learning.projects.lp1;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedList;

public class Account {
	// Class variables
	private BigDecimal balance = new BigDecimal(0.00);
	private LinkedList<BigDecimal> transactions = new LinkedList<BigDecimal>();
	private int clientID;
	private String clientName;

	// Class constructor
	public Account(String cname, int cid) {
		setClientID(cid);
		setClientName(cname);
	}

	// Method: money deposit.
	public void deposit(BigDecimal value) {
		if (value.compareTo(BigDecimal.ZERO) != 0.0) {
			setBalance(value);
			setTransaction(value);
			System.out.println(currencyFormat(value) + " deposited in your account.");
		}
	}

	// Method: money withdraw.
	public void withdraw(BigDecimal value) {
		if (value.compareTo(BigDecimal.ZERO) != 0.0) {
			setBalance(value.negate());
			setTransaction(value.negate());
			System.out.println(currencyFormat(value) + " withdrawn from your account.");
		}
	}

	// Method: simulate investment results
	public void investimentSimulation(int years, int compoundYearly, BigDecimal value, Double interestRate) {
		Double rate = interestRate / 100;
		BigDecimal interest = new BigDecimal(Math.pow(1 + (rate / compoundYearly), compoundYearly * years));
		BigDecimal investmentTotalResult = value.multiply(interest);
		BigDecimal investmentValueResult = investmentTotalResult.subtract(value);

		System.out.println("Investing " + currencyFormat(value) + " at a " + interestRate
				+ "%/year interest rate during " + years + " year(s) results in:");
		System.out.println("Investiment return value: " + currencyFormat(investmentValueResult));
		System.out.println("Total amount after investment: " + currencyFormat(investmentTotalResult));
	}

	// Method: display options menu

	public void getBalance() {
		System.out.println("Current Balance: " + currencyFormat(balance));
	}

	public void setBalance(BigDecimal value) {
		balance = balance.add(value);
	}

	public void getTransactions() {
		System.out.println("Transaction history:");
		if (!transactions.isEmpty()) {
			for (BigDecimal transaction : transactions) {
				System.out.println(currencyFormat(transaction));
			}
		} else {
			System.out.println("No transactions found!");
		}
	}

	public void setTransaction(BigDecimal value) {
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

	/**
	 * This function returns a currency formated string
	 * 
	 * @param value
	 * @return
	 */
	public static String currencyFormat(BigDecimal value) {
		return NumberFormat.getCurrencyInstance().format(value);
	}
}
