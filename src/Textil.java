import java.text.DecimalFormat;

public class Textil extends Producte{


    private String composicio;

    public Textil(double preu, String nom, int codiDeBarres,String composicio) {
        super(preu, nom, codiDeBarres);
        this.composicio=composicio;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");

        return "Textil     |" +
                " preu=" + df.format(getPreu()) +
                "| nom= " + getNom() +
                "| codiDeBarres= " + getCodiDeBarres() +
                "| composicio= " + composicio +
                '|';

    }
}
