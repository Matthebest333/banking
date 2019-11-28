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
    String type; // withdrawal: 0, deposit: 1
    double amount;

    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
    
    public String toString(){
        //@RR
            return (this.type + " of " + amount + "$");
    }
}
