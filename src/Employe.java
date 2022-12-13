public abstract class Employe {
    String nom;
    String prenom;
    int age;
    int entreeDansService;

    public Employe(String n, String p, int a, int d){
        this.nom = n;
        this.prenom = p;
        this.age = a;
        this.entreeDansService = d;
    }


    public abstract double calculerSalaire();

    public String getNom() {

        return "L'employé " + this.prenom+this.nom;
    }


}
