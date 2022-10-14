public class Electronica extends Producte{

    private int diesGarantia;

    public Electronica(int preu, String nom, int codiDeBarres,int diesGarantia) {
        super();
        this.diesGarantia=diesGarantia;
    }
    public int getDiesGarantia() {
        return diesGarantia;
    }

    public void setDiesGarantia(int diesGarantia) {
        this.diesGarantia = diesGarantia;
    }

}
