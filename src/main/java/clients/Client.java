package clients;

import java.util.ArrayList;

public class Client {
    private String client_First_Name;
    private String client_Last_Name;
    private String client_Phone_Number;
    private String client_Tarif_Name;
    private static int countClients = 0;

    //Constructure
    public Client(String client_First_Name, String client_Last_Name, String client_Phone_Number, String client_Tarif_Name) {
        this.client_First_Name = client_First_Name;
        this.client_Last_Name = client_Last_Name;
        this.client_Tarif_Name = client_Tarif_Name;
    }

    //Creating an ArrayList
    //public ArrayList<Client> listOfClients = new ArrayList<Client>();


    //Adding clients to the ArrayList
    public void addClient() {
        listOfClients.add(new Client(client_First_Name, client_Last_Name, client_Phone_Number, client_Tarif_Name));
        countClients++;
    }

    //Outputting the ArrayList
    public static void getListOfClient( ArrayList<Client> client) {
        for (int i = 0; i < client.size(); i++) {
            System.out.println(client.get(i).client_First_Name);
            System.out.println(client.get(i).client_Last_Name);
            System.out.println();
            System.out.println();
        }
    }

//    public ArrayList<Client> getListOfClient() {
//        for (Client client : listOfClients)
//            return(client);
//    }

}
