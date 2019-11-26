package banking;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;
//Class written by Chance Sztyk
public class Account implements IAccount {

    private double balance = 0;
    private int accountNumber;
    protected String type;
    private String owner;
    private static int counter;
    private ArrayList<Transaction> transactions; 
    
    public Account(String type){
        this.type = type;
        counter++;
        transactions = new ArrayList<Transaction>(); 
    }

 
    public double deposit(double depo){
        Transaction deposit = new Transaction(true, depo);
        transactions.add(deposit);
        balance += depo;
        return depo;
    }

    public void displayAllTransactions(){
        for (Transaction t: transactions){
            System.out.println(t);
        }
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public double withdrawal(double w) {
        Transaction withdrawal = new Transaction(false, w);
        transactions.add(withdrawal);
        balance -= w;
        return w;
    }

    public String getType() {
        return this.type;
    }

    public double getBalance() {
        return this.balance;
    }
    
    
    
    
}


