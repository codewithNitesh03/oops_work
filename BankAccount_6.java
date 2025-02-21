//6.Create a class bankaccount with a private balance variable. Implemets method to deposit money and get the current balance.
package oops_task;

public class BankAccount_6 {
	
	 private double balance = 5400.0;

	    // Method to deposit money into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    // Method to get the current balance
	    public double getBalance() {
	        return balance;
	    }

	   
	}


