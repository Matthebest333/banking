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
    int id;
    String firstName;
    String lastName;
    ArrayList<Account> accountList;
    static int counter;
    
    
    public Client(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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
        
   
}
