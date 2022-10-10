public class Textil extends Producte{
    private String composicio;

    public Textil(int preu, String nom, int codiDeBarres,String composicio) {
        super(preu, nom, codiDeBarres);
        this.composicio=composicio;
    }
}
