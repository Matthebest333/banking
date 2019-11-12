/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import com.sun.corba.se.impl.util.RepositoryId;
import java.util.Scanner;

public class UserInputManager implements IUserInputManager{
    Scanner kb = new Scanner(System.in);

    
    //Matthew
    @Override
    public int retrieveAccountNumber() {
        System.out.print("Enter the account number: ");
        int accNum = kb.nextInt();
        
        return accNum;
    }

    @Override
    public Account retrieveAccountType() {
        
        System.out.print("What type of account (checking or savings): ");
        String type = kb.next();
        
        
        Account newAccount = new Account(type);
        
        return newAccount;
    }

    //Matthew
    @Override
    public int retrieveClientId() {
        System.out.print("Enter desired id: ");
        int desiredId = kb.nextInt();
        return desiredId;
    }

    
    //Matthew
    @Override
    public Client retrieveClientInfo() {
        System.out.print("What is your first name: ");
        String firstName = kb.next();
        
        System.out.print("What is your last name: ");
        String lastName = kb.next();
        
        Client newClient = new Client(firstName, lastName);
        
        return newClient;
    }

    //Chris
    @Override
    public double retrieveTransactionAmount() {
        System.out.print("Enter the transaction amount: ");
        int amount = kb.nextInt();
        
        return amount;
    }
    
    //Chris
    @Override
    public int retrieveUserOption() {
        System.out.print("Enter the option number: ");
        int option = kb.nextInt();
        
        return option;
    }
    
}
