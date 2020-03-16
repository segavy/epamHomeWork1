package mobileCompanyTarifs;

public abstract class TarifGeneralDescription {
    private String tarif_name;
    private int cost_of_tarif;

    public TarifGeneralDescription(String tarif_name, String tarif_type, int cost_of_tarif) {
        this.tarif_name = tarif_name;
        this.cost_of_tarif = cost_of_tarif;
    }



}
