public class Producteur extends Employe {

    int nbUnites;

    public Producteur(String n, String p, int a, int d, int nbU) {
        super(n, p, a, d);
        this.nbUnites = nbU;
    }

    public double calculerSalaire(){
        return this.nbUnites * 5;
    }
    public String getNom() {

        return "Le producteur " + this.prenom+this.nom;
    }

}
