import clients.Client;
import mobileCompany.MobileCompany;
import mobileCompany.Tarif;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class MobileCompanyTest {

    private static final Logger LOG  = LoggerFactory.getLogger(MobileCompanyTest.class);

    @Test
    public void countOfAddedClientsShouldBeTheSameAsInTheMethodSIZE() {
        Client client1 = new Client("Vasiliy", "+375291111111");
        Client client2 = new Client("Ekaterina", "+375292222222");
        Client client3 = new Client("Alexander", "+375293333333");
        Client client4 = new Client("Irina", "+375294444444");
        ArrayList<Client> allClients = new ArrayList<Client>();
        allClients.add(client1);
        allClients.add(client2);
        allClients.add(client3);
        allClients.add(client4);
        Assert.assertEquals(4, allClients.size());
    }


    @Test
    public void allTarifsShouldSortedAsAscendingCost() {
        MobileCompany mts = new MobileCompany("MTS");

        Tarif children = new Tarif("Children", 1);
        Tarif superMax = new Tarif("SuperMAX", 27);
        Tarif internetMini = new Tarif("InternetMini", 8);
        Tarif internetMaxi = new Tarif("InternetMAXI", 15);
        Tarif bezlimit = new Tarif("Bezlimit", 150);
        mts.addTarif(children);
        mts.addTarif(superMax);
        mts.addTarif(internetMini);
        mts.addTarif(internetMaxi);
        mts.addTarif(bezlimit);

        ArrayList<Tarif> expected = new ArrayList<Tarif>();
        expected.add(children);
        expected.add(internetMini);
        expected.add(internetMaxi);
        expected.add(superMax);
        expected.add(bezlimit);

        Assert.assertEquals(expected, mts.sortTarif());

    }
}
