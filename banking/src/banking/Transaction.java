/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Chris
 */
public class Transaction implements ITransaction {
    boolean type; // withdrawal: 0, deposit: 1
    double amount;

    public Transaction(boolean type, double amount){
        this.type = type;
        this.amount = amount;
    }
    
    public String toString(){
        if(type){
            return ("Deposit: " + amount + "$");
        }else{
            return ("Withdrawal: " + amount + "$");
        }
    }
}
