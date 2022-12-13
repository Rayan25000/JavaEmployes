public class Vendeur extends EmployeChiffreAffaire{

    public Vendeur(String n, String p, int a, int d, int ca) {
        super(n, p, a, d, ca);
    }

    @Override
    public double calculerSalaire() {
        return this.chiffreAffaire * 0.2 + 400;
    }

    public String getNom() {

        return "Le vendeur " + this.prenom+this.nom;
    }
}
