package mobileCompany;

import clients.Client;

public class Contract {
    private Client client;
    private MobileCompany mobileCompany;
    private Tarif tarif;

    public Contract(MobileCompany mobileCompany, Client client, Tarif tarif) {
        this.mobileCompany = mobileCompany;
        this.client = client;
        this.tarif = tarif;
    }

    public Client getClient() {
        return client;
    }

    public Tarif getTarif() {
        return tarif;
    }

    public MobileCompany getMobileCompany() {
        return mobileCompany;
    }

    @Override
    public String toString() {
        return "Client " + client /* + ", tarif is " + tarif */;
    }


}
