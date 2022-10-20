import java.util.*;

public class Carro {
      private List <Producte> productes = new LinkedList<Producte>();
     ArrayList<Alimentacio> productesAlimentacio = new ArrayList<>();
     ArrayList<Textil> productesTextil = new ArrayList<>();
     ArrayList<Electronica> productesElectronica = new ArrayList<>();


    public List<Producte> getProductes() {
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
    public void afegirProducte(Producte p){
        productes.add(p);
    }

    public void repetitsNo () {
        Set<Producte> repetitsNo = new HashSet<>(productes);
        repetitsNo.forEach(System.out::println);//Imprimim l'objecte que no repeteix
    }

    public void tiquet () {

        Set<Producte> repetitsNo = new HashSet<>(productes);
        repetitsNo.forEach(System.out::println);//Imprimim l'objecte que no repeteix

    }

    @Override
    public String toString() {
        return "Carro{" +
                "productes=" + productes +
                ", productesAlimentacio=" + productesAlimentacio +
                ", productesTextil=" + productesTextil +
                ", productesElectronica=" + productesElectronica +
                '}';
    }
    public String mostrarCarro() {
        String producte="";
        for (int i = 0; i < productes.size(); i++) {
           producte += this.productes.get(i).toString()+"\n";
        }
         return producte;
    }
    public class ComparadorCodiBarres implements Comparator<Producte> {
        @Override
        public int compare(Producte c1, Producte c2) {
            if(c1.getCodiDeBarres()== c2.getCodiDeBarres()) return -1;
            else return 0;
        }

    }

    public String imprimirCarro(List<Producte> carro) {
        String mostraProductesCarro="";
        int contadorArrayList=0;
        ArrayList <Integer> totalProductes = new ArrayList<>();
        List <Producte> productesCarro = new LinkedList<>();
        for (int i = 0; i < carro.size(); i++) {
            if (i!=carro.size()|| carro.get(i).getCodiDeBarres() == carro.get(i+1).getCodiDeBarres()) {
                totalProductes.add(contadorArrayList, +1);
            }
                else {
                productesCarro.add(carro.get(i));
                contadorArrayList++;
            }

            }
        for (int i = 0; i < productesCarro.size(); i++) {
            mostraProductesCarro+= ""+ totalProductes.get(i)+" x "+ productesCarro.get(i).toString()+ "\n";

        }
        return mostraProductesCarro;
    }

}
