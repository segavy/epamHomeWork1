package clients;

import java.util.ArrayList;

public class Client {
    private String first_Name;
    private String last_Name;
    private String tarif_Name;
    private static int countClients = 0;

    ArrayList<Client> listOfClients = new ArrayList<Client>();

    public Client(String first_Name, String last_Name, String tarif_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.tarif_Name = tarif_Name;
    }

    public void addClient(Client client) { //String firstName, String lastName, String tarifName) {
        listOfClients.add(client);
        countClients++;
    }

}
