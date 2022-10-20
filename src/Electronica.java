import java.text.DecimalFormat;

public class Electronica extends Producte{

    private int diesGarantia;



    public Electronica(double preu, String nom, int codiDeBarres, int diesGarantia) {
        super(preu, nom, codiDeBarres);
        this.diesGarantia=diesGarantia;
    }
    public int getDiesGarantia() {
        return diesGarantia;
    }

    public void setDiesGarantia(int diesGarantia) {
        this.diesGarantia = diesGarantia;
    }
    public void preuDiesGarantia(int diesGarantia){
        double preuFinal;
        double preuActual = this.getPreu();
        preuFinal = preuActual +  (preuActual *(diesGarantia/365)*0.1);
        this.setPreu(preuFinal);
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Electronica |" +
                " preu=" + df.format(getPreu()) +
                "| nom= " + getNom() +
                "| codiDeBarres=" + getCodiDeBarres() +
                "| diesGarantia=" + diesGarantia +
                '|';

    }
}
