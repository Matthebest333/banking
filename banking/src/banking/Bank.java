package banking;

import java.util.Scanner;
import java.util.ArrayList;

public class Bank implements IBank{
    
    private int bankNumber;
    private String address;
    ArrayList<Client> clientList = new ArrayList<Client>();
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

    }

    public void displayClientList(){
            for(int i = 0; i < clientList.size(); i++){
                    System.out.println("(" + (i + 1) + ")" + clientList.get(i).firstName + ", " + clientList.get(i).lastName);
            }
    }

    public Client getClient(int id){
        return clientList.get(id);
    }

    @Override
    public Account getClientAccount(int clientId, int accountNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

            
}
