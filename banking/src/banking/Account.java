package banking;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;
//Class written by Chance Sztyk
public class Account implements IAccount {

    private double balance = 0;
    private int accountNumber;
    private String type;
    private String owner;
    private static int counter;
    private ArrayList<Transaction> Transactions; 
    
    public Account(String type){
        this.type = type;
        counter++;
    }


    public double deposit(double depo){
        Transaction deposit = new Transaction(true, depo);
        Transactions.add(deposit);
        return depo;
    }

    public void displayAllTransactions(){
        for (Transaction t: Transactions){
            System.out.println(t);
        }
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        return Transactions;
    }

    @Override
    public double withdrawal(double w) {
        Transaction withdrawal = new Transaction(false, w);
        Transactions.add(withdrawal);
        return w;
    }

    public String getType() {
        return this.type;
    }

    public double getBalance() {
        return this.balance;
    }
    
    
    
    
}


