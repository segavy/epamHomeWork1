package mobileCompany;

public class Tarif {
    private String nameTarif;
    private float cost;

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

    @Override
    public String toString() {
        return "\n" + "Tarif name is '" + nameTarif + "', cost is " + cost;

    }
}
