package mobileCompany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MobileCompany {
    private String nameCompany;
    private ArrayList<Contract> contracts;
    private ArrayList<Tarif> tariffs;

    public MobileCompany(String nameCompany) {
        this.nameCompany = nameCompany;
        contracts = new ArrayList<Contract>();
        tariffs = new ArrayList<Tarif>();
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
        tariffs.add(tarif);
    }

    public ArrayList<Tarif> getTariffs() {
        return tariffs;
    }

    public ArrayList<Tarif> sortTarif() {
        ArrayList<Tarif> sortTarif = tariffs;
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
        ArrayList<Tarif> tarifWithCost = new ArrayList<Tarif>();
        for (Tarif tarif : tariffs) {
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
