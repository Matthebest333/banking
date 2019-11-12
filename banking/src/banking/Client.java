
package banking;

import java.util.ArrayList;

public class Client implements IClient{
    //written by chance
    private int id;
    private String firstName;
    private String lastName;
    ArrayList<Account> accountList = new ArrayList<Account>();
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

    //written by matthew
    public void displayAccounts() {
        for(int i = 0; i < accountList.size(); i++){
                    System.out.println("(" + i + ") " + accountList.get(i).getType());
        }
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
