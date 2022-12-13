public class Representant extends EmployeChiffreAffaire{

    public Representant(String n, String p, int a, int d, int ca) {
        super(n, p, a, d, ca);
    }
    @Override
    public double calculerSalaire() {
        return this.chiffreAffaire * 0.2 + 800;
    }
    public String getNom() {

        return "Le représentant " + this.prenom+this.nom;
    }
}
