package com.venkat;

import java.io.Serializable;

public class Bank {
    private float balance=3000.15f;
    
    public void setBalance(float balance) {
		this.balance = balance;
	}
    
    public float getBalance() {
		return balance;
	}
    
    public void deposit(float balance) {
    	this.balance +=balance;
		

	}
    
    public void withdraw(int amt) {
    	if(amt <= balance)
    		balance = amt;
    	System.out.println("Avilable Balance: "+ getBalance());
		
    

	}
}
