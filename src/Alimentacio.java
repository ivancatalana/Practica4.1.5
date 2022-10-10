public class Alimentacio extends Producte{
    private int diesCaducitat;
    public Alimentacio(int preu, String nom, int codiDeBarres, int diesCaducitat){
        super(preu, nom, codiDeBarres);
        this.diesCaducitat=diesCaducitat;

    }
}
