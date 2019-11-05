/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

public class UserInputManager implements IUserInputManager{
    Scanner kb = new Scanner(System.in);

    @Override
    public int retrieveAccountNumber() {
        System.out.print("Enter the account number: ");
        int accNum = kb.nextInt();
        
        return accNum;
    }

    @Override
    public Account retrieveAccountType() {
        
    }

    @Override
    public int retrieveClientId() {
        
    }

    @Override
    public Client retrieveClientInfo() {
        System.out.print("Enter the first name: ");
        
    }

    @Override
    public double retrieveTransactionAmount() {
        
    }

    @Override
    public int retrieveUserOption() {
        
    }
    
}
