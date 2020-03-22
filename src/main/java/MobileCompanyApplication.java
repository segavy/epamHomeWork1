import clients.Client;
import mobileCompany.Contract;
import mobileCompany.MobileCompany;
import mobileCompany.Tarif;

import java.util.ArrayList;

public class MobileCompanyApplication {

    public static void main(String[] args) {

        MobileCompany mts = new MobileCompany("MTS");

        Tarif children = new Tarif("Children", 1);
        Tarif superMax = new Tarif("SuperMAX",27);
        Tarif internetMini = new Tarif("InternetMini", 8);
        Tarif internetMaxi = new Tarif("InternetMAXI", 15);
        Tarif bezlimit = new Tarif("Bezlimit", 150);

        mts.addTarif(children);
        mts.addTarif(superMax);
        mts.addTarif(internetMini);
        mts.addTarif(internetMaxi);
        mts.addTarif(bezlimit);
        mts.addTarif(new Tarif("TestTarif", 123));

        Client client1 = new Client ("Vasiliy", "+375291111111");
        Client client2 = new Client ("Ekaterina","+375292222222");
        Client client3 = new Client ("Alexander","+375293333333");
        Client client4 = new Client ("Irina", "+375294444444");

        ArrayList<Client> allClients = new ArrayList<Client>();
        allClients.add(client1);
        allClients.add(client2);
        allClients.add(client3);
        allClients.add(client4);

        Contract contract1 = new Contract(mts, client1, superMax);
        Contract contract2 = new Contract(mts, client2, bezlimit);
        Contract contract3 = new Contract(mts, client3, children);

        mts.addContract(contract1);
        mts.addContract(contract2);
        mts.addContract(contract3);

        System.out.print("The enable tarifs are : ");
        System.out.println(mts.getTarifs());

        System.out.println();
        System.out.println("Count of registered clients is : "  + mts.getContracts().size());
        System.out.println("Common count of clients is : " + allClients.size());

        System.out.println();
        System.out.println("Please review all tarifs sorted by ascending cost:");
        System.out.println(mts.sortTarif());

        System.out.println();
        System.out.println("Tarif with cost not more than 50 r. :");
        System.out.println(mts.getTarifWithCost(50));
    }
}

