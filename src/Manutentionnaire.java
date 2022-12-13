public class Manutentionnaire extends Employe {

    int nbHeures;



    public Manutentionnaire(String n, String p, int a, int d, int nbH) {
        super(n, p, a, d);
        this.nbHeures = nbH;
    }

    @Override
    public double calculerSalaire() {
        return this.nbHeures * 65;
    }

}
