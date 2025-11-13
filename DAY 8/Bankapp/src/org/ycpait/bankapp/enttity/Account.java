package org.ycpait.bankapp.enttity;

public class Account {
	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	synchronized public void withdraw(int amount) {
		System.out.println(this.balance + "Check balance by "+ Thread.currentThread().getName());
		this.balance =this.balance-amount;
		try {
			wait();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.balance + "Check balance by "+ Thread.currentThread().getName());
	}
	
	synchronized public void deposit(int amount) {
    	System.out.println(this.balance + "Check balance by "+ Thread.currentThread().getName());
    	this.balance = this.balance + amount;
    	notify();
    	System.out.println(this.balance + "Check balance by "+ Thread.currentThread().getName());
	}
	
	
    
    
	

	

}
