
package banking;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        
        Bank myBank = new Bank(123, "road idk");
        
        boolean exit = false;
        
        do{
            int taskNo = kb.nextInt();
            
            switch(taskNo){
                case 1:
                    //add client
                    Client newClient = new Client("matthe", "meye");
                    myBank.addClient(newClient);

                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

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
