package banking;

import java.util.ArrayList;

public class Account implements IAccount extends Client{

	private double savingsBalance = 0;
	private double checkingBalance = 0;
	private ArrayList<double> transactions = new ArrayList<double>();
	private int accountNumber;
	private string type;
	private string owner;

	Account(string type){
		this.type = type;
	}


	public double deposit(double depo){
		transactions.add(depo);
		balance += depo;
	}

	public void displayAllTransactions(){
		for(int i = 0; i < transactions.size(); i++){
			System.out.println()
		}
	}
}