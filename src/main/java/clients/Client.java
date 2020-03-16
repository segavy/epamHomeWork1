package clients;

import java.util.ArrayList;

public class Client {
    private String client_First_Name;
    private String client_Last_Name;
    private String client_Phone_Number;
    private String client_Tarif_Name;
    private static int countClients = 0;

    public Client(String client_First_Name, String client_Last_Name, String client_Phone_Number, String client_Tarif_Name) {
        this.client_First_Name = client_First_Name;
        this.client_Last_Name = client_Last_Name;
        this.client_Tarif_Name = client_Tarif_Name;
    }

    ArrayList<Client> listOfClients = new ArrayList<Client>();

    public void addClient() {
        listOfClients.add(new Client(client_First_Name, client_Last_Name, client_Phone_Number, client_Tarif_Name));
        countClients++;
    }

    public static void /*ArrayList<Client> */ getListOfClient( ArrayList<Client> client) {
        for (int i = 0; i < client.size(); i++)
            System.out.println(client.get(i));
    }

//    public ArrayList<Client> getListOfClient() {
//        for (Client client : listOfClients)
//            return(client);
//    }

}
