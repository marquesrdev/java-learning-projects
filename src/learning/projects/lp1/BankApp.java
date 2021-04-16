package learning.projects.lp1;

public class BankApp {

	public static void main(String[] args) {
		Account ac1 = new Account("Rafael", 1);

		ac1.deposit(5500.27);
		ac1.withdraw(300);
		ac1.getBalance(); // print
		ac1.withdraw(150);
		ac1.deposit(1230.00);
		ac1.getBalance(); // print
		ac1.getTransactions(); // print
		ac1.investimentSimulation(3, 12, 15000.00, 1.7);

	}

}
