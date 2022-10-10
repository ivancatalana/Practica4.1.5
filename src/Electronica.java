public class Electronica extends Producte{
    private int diesGarantia;

    public Electronica(int preu, String nom, int codiDeBarres,int diesGarantia) {
        super(preu, nom, codiDeBarres);
        this.diesGarantia=diesGarantia;
    }
}
