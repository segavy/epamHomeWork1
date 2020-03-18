package mobileCompany;

import java.util.ArrayList;

public class Tarif {
    private String nameTarif;
    private float cost;
    //ArrayList<Tarif> tarifs = new ArrayList<Tarif>();

    public Tarif(String nameTarif, float cost) {
        this.nameTarif = nameTarif;
        this.cost = cost;
    }

    public String getNameTarif() {
        return nameTarif;
    }

    public float getCost() {
        return cost;
    }

//    public void addTarif(tarifs) {
//        tarifs.add(tarifs);
//    }

    @Override
    public String toString() {
        return "Tarif name is " + nameTarif + ", cost is " + cost;
    }
}
