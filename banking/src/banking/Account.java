package banking;

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
        counter ++;
    }


    public double deposit(double depo){
        Transaction deposit = new Transaction(depo);
        Transactions.add(deposit);
        
    }

    public void displayAllTransactions(){

    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double withdrawal(double w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}