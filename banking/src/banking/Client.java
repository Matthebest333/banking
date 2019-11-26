
package banking;

import java.util.ArrayList;

public class Client implements IClient{
    //written by Chance Sztyk
    private int id;
    private String firstName;
    private String lastName;
    //@RR
    private ArrayList<Account> accountList;
    private static int counter;
    
    
    public Client(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = Client.counter;
        counter++;
        //@RR
        this.accountList = new ArrayList<Account>();
    }
    
    public void addAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    //written by matthew
    public void displayAccounts() {
        for(int i = 0; i < accountList.size(); i++){
            //System.out.println("(" + i + ") " + accountList.get(i).getType() + ": " + accountList.get(i).getBalance());
            //@RR
            System.out.println(accountList.get(i));
        }
    }

    
    public Account getAccount(int accountNumber) {
        for(Account a: accountList){
            if(a.getAccountNumber() == id){
                return a;
            }
        }
        return null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getId() {
        return counter;
    }

    public void setId(int counter) {
        Client.counter = counter;
    }
        
   
    
}
