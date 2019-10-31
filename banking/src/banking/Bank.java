package banking;

import java.util.Scanner;
import java.util.ArrayList;

public class Bank implements IBank{
    
    private String bankNumber;
    private String address;
    ArrayList<Client> clientList = new ArrayList<Client>();
    Scanner kb = new Scanner(System.in);

    public void addClient(){
            System.out.print("Enter full name: ");
            String firstName = kb.next();
            String lastName = kb.next();

            System.out.print("Enter id: ");
            int id = kb.nextInt();
            clientList.add(firstName, lastName, id);
    }

    public void displayClientAccounts(int clientId){

    }

    public void displayClientList(){
            for(int i = 0; i < clientList.size(); i++){
                    System.out.println("(" + (i + 1) + ")" + clientList.get(i).firstName + ", " + clientList.get(i).lastName);
            }
    }

    public Client getClient(int id){
        return clientList.get(id);
    }
            
}
