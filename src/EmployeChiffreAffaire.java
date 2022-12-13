public abstract class EmployeChiffreAffaire extends Employe{

    float chiffreAffaire;

    public EmployeChiffreAffaire(String n, String p, int a, int d, int ca) {
        super(n, p, a, d);
        this.chiffreAffaire = ca;
    }
}
