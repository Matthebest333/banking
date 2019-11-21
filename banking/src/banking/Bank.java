package banking;

import java.util.Scanner;
import java.util.ArrayList;
//written by Matthew
public class Bank implements IBank{
    
    private int bankNumber;
    private String address;
    public ArrayList<Client> clientList = new ArrayList<Client>();
    Scanner kb = new Scanner(System.in);

    
    //bank constructor
    public Bank(int bankNumber, String address){
        this.bankNumber = bankNumber;
        this.address = address;
    }
    
    public void addClient(Client newClient){
            clientList.add(newClient);
    }

    public void displayClientAccounts(int clientId){
        getClient(clientId).displayAccounts();
    }

    public void displayClientList(){
            for(int i = 0; i < clientList.size(); i++){
                    System.out.println("(" + i + ") " + clientList.get(i).getFirstName() + ", " + clientList.get(i).getLastName());
            }
    }

    public Client getClient(int id){
        return clientList.get(id);
    }

    public Account getClientAccount(int clientId, int accountNumber) {

        return getClient(clientId).getAccount(accountNumber);

    }     
}
