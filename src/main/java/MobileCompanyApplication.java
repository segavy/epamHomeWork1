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

        //for (Tarif tarif:Tarif) {}

        Client client1 = new Client("Vasiliy", "+375291111111");
        Client client2 = new Client ("Ekaterina","+375292222222");
        Client client3 = new Client ("Alexander","+375293333333");


        ArrayList<Client> allClients = new ArrayList<Client>();


        Contract contract1 = new Contract(mts, client1, superMax);
        Contract contract2 = new Contract(mts, client2, bezlimit);
        Contract contract3 = new Contract(mts, client3, bezlimit);

        mts.addContract(contract1);
        mts.addContract(contract2);
        mts.addContract(contract3);


        System.out.println("The enable tarifs are : ");

        System.out.println("Count of clients is "  + mts.getContracts().size());




    }


}

