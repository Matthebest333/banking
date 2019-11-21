
package banking;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("•	[1] Add a new Client  \n" +
                        "•	[2] Create a new Account \n" +
                        "•	[3] Make a Deposit\n" +
                        "•	[4] Make a Withdrawal\n" +
                        "•	[5] List Account Transactions\n" +
                        "•	[6] List Clients\n" +
                        "•	[7] List Client Accounts");
        
        
        Bank myBank = new Bank(123, "My bank");
        UserInputManager myUserInputManager = new UserInputManager();
        
        boolean exit = false;
        //writen by matthew
        do{
            int taskNo = myUserInputManager.retrieveUserOption();
            int id;
            int accNumber;
            
            switch(taskNo){
                case 1:
                    //add client
                    System.out.println("Add new client");
                    Client newClient = myUserInputManager.retrieveClientInfo();
                    myBank.addClient(newClient);
                break;
                case 2:
                    //add account
                    System.out.println("Add new account");
                                        
                    id = myUserInputManager.retrieveClientId();
                    Account newAccount = myUserInputManager.retrieveAccountType();

                    
                    //go from back, pick client and make account
                    myBank.getClient(id).addAccount(newAccount);
                break;
                case 3:
                    // make deposit
                    System.out.println("Deposit");
                    
                    id = myUserInputManager.retrieveClientId();
                    accNumber = myUserInputManager.retrieveAccountNumber();
                    double depositAmount = myUserInputManager.retrieveTransactionAmount();
                    
                    System.out.printf("Deposited %.2f$%n", myBank.getClientAccount(id, accNumber).deposit(depositAmount));

                break;
                case 4:
                    // make withdrawal
                    System.out.println("Withdraw");
                    
                    id = myUserInputManager.retrieveClientId();
                    accNumber = myUserInputManager.retrieveAccountNumber();
                    double withdrawalAmount = myUserInputManager.retrieveTransactionAmount();
                    
                    System.out.printf("Withdrew %.2f$%n", myBank.getClientAccount(id, accNumber).withdrawal(withdrawalAmount));
                    
                break;
                case 5:
                    System.out.println("List account transactions");
                    
                    id = myUserInputManager.retrieveClientId();
                    accNumber = myUserInputManager.retrieveAccountNumber();
                    
                    myBank.getClientAccount(id, accNumber).displayAllTransactions();
                break;
                case 6:
                    //list clients
                    System.out.println("Client list");
                    
                    myBank.displayClientList();
                break;
                case 7:
                    //list client accounts
                    System.out.println("Account list");
                    
                    id = myUserInputManager.retrieveClientId();
                    myBank.displayClientAccounts(id);
                break;
                case 8:
                    exit = true;
                break;
                default:
            }
        }while(exit == false);
    }
    
}
