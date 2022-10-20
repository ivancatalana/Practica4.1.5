public class Textil extends Producte{


    private String composicio;

    public Textil(double preu, String nom, int codiDeBarres,String composicio) {
        super(preu, nom, codiDeBarres);
        this.composicio=composicio;
    }
    @Override
    public String toString() {
        return "Textil{" +
                "preu=" + getPreu() +
                ", nom= " + getNom() +
                ", codiDeBarres=" + getCodiDeBarres() +
                ", composicio='" + composicio +
                '}';
    }
}
