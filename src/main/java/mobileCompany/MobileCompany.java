package mobileCompany;

import java.util.ArrayList;

public class MobileCompany {
    private String              nameCompany;
    private ArrayList<Contract> contracts;
    private ArrayList<Tarif>    tarifs;

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

    @Override
    public String toString() {
        return ("Company name is " + nameCompany /* + ", contract  is" + contracts */ );
    }


}
