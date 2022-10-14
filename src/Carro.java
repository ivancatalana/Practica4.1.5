import java.util.ArrayList;

public class Carro {
     ArrayList<Producte> productes = new ArrayList<>();
     ArrayList<Alimentacio> productesAlimentacio = new ArrayList<>();
     ArrayList<Textil> productesTextil = new ArrayList<>();
     ArrayList<Electronica> productesElectronica = new ArrayList<>();


    public ArrayList<Producte> getProductes() {
        return productes;
    }

    public void setProductes(ArrayList<Producte> productes) {
        this.productes = productes;
    }

    public ArrayList<Alimentacio> getProductesAlimentacio() {
        return productesAlimentacio;
    }

    public void setProductesAlimentacio(ArrayList<Alimentacio> productesAlimentacio) {
        this.productesAlimentacio = productesAlimentacio;
    }

    public ArrayList<Textil> getProductesTextil() {
        return productesTextil;
    }

    public void setProductesTextil(ArrayList<Textil> productesTextil) {
        this.productesTextil = productesTextil;
    }

    public ArrayList<Electronica> getProductesElectronica() {
        return productesElectronica;
    }

    public void setProductesElectronica(ArrayList<Electronica> productesElectronica) {
        this.productesElectronica = productesElectronica;
    }
    public void carroAlim(Producte producte,Alimentacio alimentacio){

    }
}
