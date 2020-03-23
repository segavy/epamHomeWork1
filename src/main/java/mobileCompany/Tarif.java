package mobileCompany;

public class Tarif {
    private String nameTariff;
    private float cost;

    public Tarif(String nameTarif, float cost) {
        this.nameTariff = nameTarif;
        this.cost = cost;
    }

    public String getNameTariff() {
        return nameTariff;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "\n" + "Tarif name is '" + nameTariff + "', cost is " + cost;

    }
}
