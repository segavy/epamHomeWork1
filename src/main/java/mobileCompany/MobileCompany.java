package mobileCompany;

import java.util.ArrayList;

public class MobileCompany {
    private String nameCompany;
    private ArrayList<Contract> contracts;

    public MobileCompany(String nameCompany) {
        this.nameCompany = nameCompany;
        contracts = new ArrayList<Contract>();
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

    @Override
    public String toString() {
        return ("Company name is " + nameCompany + ", contract  is" + contracts);
    }


}
