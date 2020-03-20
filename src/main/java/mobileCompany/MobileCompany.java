package mobileCompany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MobileCompany {
    private String nameCompany;
    private ArrayList<Contract> contracts;
    private ArrayList<Tarif> tarifs;

    public MobileCompany(String nameCompany) {
        this.nameCompany = nameCompany;
        contracts = new ArrayList<Contract>();
        tarifs = new ArrayList<Tarif>();
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public ArrayList<Contract> getContracts(){
        return contracts;
    }

    public void addTarif(Tarif tarif) {
        tarifs.add(tarif);
    }

    public ArrayList<Tarif> getTarifs() {
        return tarifs;
    }

    public ArrayList<Tarif> sortTarif() {
        ArrayList<Tarif> sortTarif = tarifs;
        Collections.sort(sortTarif, new Comparator<Tarif>() {
            //@Override
            public int compare(Tarif o1, Tarif o2) {
                if (o1.getCost() > o2.getCost()) {
                    return 1;
                } else if (o1.getCost() < o2.getCost()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return sortTarif;
    }


    public ArrayList<Tarif> getTarifWithCost(float cost) {
        ArrayList<Tarif> tarifWithCost = null;
        for (Tarif tarif : tarifs) {
            if (tarif.getCost() < cost) {
                tarifWithCost.add(tarif);
            }
        }
        return tarifWithCost;
    }

    @Override
    public String toString() {
        return ("Company name is " + nameCompany /* + ", contract  is" + contracts */ );
    }

}
