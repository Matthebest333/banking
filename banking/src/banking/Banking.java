
package banking;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int taskNo = kb.nextInt();
        
        Bank myBank = new Bank(123, "road idk");
        
        switch(taskNo){
            case 1:
                //add client
                Client newClient = new Client("matthe", "meye", 1);
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
            default:
        }
    }
    
}
