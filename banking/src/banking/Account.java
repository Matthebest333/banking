package banking;

import java.util.ArrayList;

public class Account implements IAccount {

    private double balance = 0;
    private int accountNumber;
    private String type;
    private String owner;

    public Account(String type){
        this.type = type;
    }


    public double deposit(double depo){

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