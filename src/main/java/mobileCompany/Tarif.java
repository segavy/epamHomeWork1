package mobileCompany;

import java.util.ArrayList;

public class Tarif {
    private String nameTarif;
    private float cost;
//    private ArrayList<Tarif> tarifsSecondArrayList;

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



    //Do not use now these three methods.
//    public void creatSecondArrayList() {
//        // ???????     Do not know if I will use it
//        tarifsSecondArrayList = new ArrayList<Tarif>();
//    }
//    public void addTarifToSecondArrayList(Tarif tarifs) {
//        this.tarifsSecondArrayList.add(tarifs);
//    }
//        public ArrayList<Tarif> getTarifs() {
//        return tarifsSecondArrayList;
//    }




    @Override
    public String toString() {
        return "\n" + "Tarif name is '" + nameTarif + "', cost is " + cost;

    }
}
