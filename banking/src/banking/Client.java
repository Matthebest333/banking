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
    ArrayList<Account> accountList;
    static int counter;
    
    
    public Client(String firstName, int id){
        this.firstName = firstName;
        this.id = id;
        counter++;


    }
    
    public void addAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    
    public void displayAccounts() {
        
        
    }

    
    public Account getAccount(int accountNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
