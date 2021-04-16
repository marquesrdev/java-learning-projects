package learning.projects.lp1;

import java.math.BigDecimal;

public class BankApp {

	public static void main(String[] args) {
		Account ac1 = new Account("Rafael", 1);

		ac1.deposit(new BigDecimal(5500.27));
		ac1.withdraw(new BigDecimal(300));
		ac1.getBalance(); // print
		ac1.withdraw(new BigDecimal(150));
		ac1.deposit(new BigDecimal(1230.00));
		ac1.getBalance(); // print
		ac1.getTransactions(); // print
		ac1.investimentSimulation(3, 12, new BigDecimal(15000.00), 1.7);

	}

}
