public class ManuARisque extends Manutentionnaire implements Prime{
    public ManuARisque(String n, String p, int a, int d, int nbH) {
        super(n, p, a, d, nbH);
    }
    @Override
    public double calculerSalaire() {
        return this.nbHeures * 65 + Prime.montant;
    }
}
