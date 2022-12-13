public class ProdARisque extends Producteur{
    public ProdARisque(String n, String p, int a, int d, int nbU) {
        super(n, p, a, d, nbU);
    }
    @Override
    public double calculerSalaire() {
        return this.nbUnites * 65 + Prime.montant;
    }
}
