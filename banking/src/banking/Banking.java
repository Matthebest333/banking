
package banking;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        
        Bank myBank = new Bank(123, "road idk");
        UserInputManager myUserInputManager = new UserInputManager();
        
        boolean exit = false;
        //writen by matthew
        do{
            int taskNo = myUserInputManager.retrieveUserOption();
            int id;
            
            switch(taskNo){
                case 1:
                    //add client
                    Client newClient = myUserInputManager.retrieveClientInfo();
                    myBank.addClient(newClient);
                break;
                case 2:
                    //add account
                    Account newAccount = myUserInputManager.retrieveAccountType();
                    
                    id = myUserInputManager.retrieveClientId();
                    
                    //go from back, pick client and make account
                    myBank.getClient(id).addAccount(newAccount);
                break;
                case 3:
                    // make deposit
                    id = myUserInputManager.retrieveClientId();
                    int accNumber = myUserInputManager.retrieveAccountNumber();
                    
                    double depositAmount = myUserInputManager.retrieveTransactionAmount();
                    
                    myBank.getClient(id).addAccount(newAccount);
                    
                    
                break;
                case 4:
                    // make withdrawal
                    
                break;
                case 5:

                break;
                case 6:
                    //list clients
                    myBank.displayClientList();
                break;
                case 7:
                    id = myUserInputManager.retrieveClientId();
                    myBank.getClient(id).displayAccounts();
                break;
                case 8:
                    exit = true;
                break;
                default:
            }
        }while(exit == false);
    }
    
}
