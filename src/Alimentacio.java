public class Alimentacio extends Producte{
    private int diesCaducitat;


    public Alimentacio(double preu, String nom, int codiDeBarres, int diesCaducitat){
        super(preu, nom, codiDeBarres);
        this.diesCaducitat=diesCaducitat;

    }
    public void diesCaducitat (int dies){
        double preuFinal;
        double preuActual = this.getPreu();
        preuFinal = preuActual - (preuActual*(1/(double)dies) - (preuActual * 0.1));
        this.setPreu(preuFinal);

    }
    @Override
    public String toString() {
        return "Alimentacio{" +
                "preu=" + getPreu() +
                ", nom= " + getNom() +
                ", codiDeBarres=" + getCodiDeBarres() +
                ", diesCaducitat=" + diesCaducitat +
                '}';
    }

}
