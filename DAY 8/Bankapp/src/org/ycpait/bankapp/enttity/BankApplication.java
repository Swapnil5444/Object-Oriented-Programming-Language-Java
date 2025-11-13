package org.ycpait.bankapp.enttity;

public class BankApplication {

	public static void main(String[] args) {
		
		Account a = new Account(5000);
		
		Thread wife = new Thread(() -> a.withdraw(1000));
		wife.setName("Wife");
		
		Thread husband = new Thread(() -> a.deposit(1000));
		husband.setName("Husband");
		

		wife.start();
		husband.start();
	}

}
