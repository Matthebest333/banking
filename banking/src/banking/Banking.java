
package banking;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        
        Bank myBank = new Bank(123, "road idk");
        UserInputManager myUserInputManager = new UserInputManager();
        
        boolean exit = false;
        
        do{
            int taskNo = kb.nextInt();
            
            switch(taskNo){
                case 1:
                    //add client
                    Client newClient = myUserInputManager.retrieveClientInfo();
                    myBank.addClient(newClient);
                break;
                case 2:
                    //add account
                    Account newAccount = myUserInputManager.retrieveAccountType();
                    myBank.clientList.get(myUserInputManager.retrieveClientId()).accountList.add(myUserInputManager.retrieveAccountType());
                break;
                case 3:
                    // make deposit
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

                break;
                case 8:
                    exit = true;
                break;
                default:
            }
        }while(exit == false);
    }
    
}
