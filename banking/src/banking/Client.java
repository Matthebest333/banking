/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author cstuser
 */
public class Client implements IClient{
    //Class programmed by Chance
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accountList;
    private static int counter;
    
    
    public Client(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = Client.counter;
        counter++;
    }
    
    public void addAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    
    public void displayAccounts() {
        System.out.println(accountList.toString());
        
    }

    
    public Account getAccount(int accountNumber) {
        return accountList.get(accountNumber);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
        
   
    
}
