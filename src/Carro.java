import java.text.DecimalFormat;
import java.util.*;


//Class carro que guardará tots els productes amb la List de productes privat que será l'únic que omplirem.

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


    public String mostrarProductesFrequenciaCarro () {

        //Creacio de Class que tindrà productes i la frequéncia a una Llista amb tots dos objectes
        class FreqProductes{
            Producte p;
            int freq;

            @Override
            public String toString() {
                DecimalFormat df = new DecimalFormat("#.00");

                return  ""+freq  +"x |"+ p.getNom()+" "+"|  Codi:" + p.getCodiDeBarres() + " "+
                        " \n";
            }

            FreqProductes(Producte p , int freq){
                this.p = p;
                this.freq=freq;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                FreqProductes freqProductes = (FreqProductes) o;
                return Double.compare(p.getPreu(), p.getPreu()) == 0 && p.getCodiDeBarres() == p.getCodiDeBarres();
            }

            @Override
            public int hashCode() {
                return Objects.hash(p.getPreu(), p.getCodiDeBarres());
            }
        }
             class ComparadorCodiBarres implements Comparator<FreqProductes> {
                 @Override
                 public int compare(FreqProductes c1, FreqProductes c2) {
                     if (c1.p.getCodiDeBarres() > c2.p.getCodiDeBarres()) return -1;
                     else if (c1.p.getCodiDeBarres() < c2.p.getCodiDeBarres()) return 1;

                     else return 0;
                 }
             }


        List<FreqProductes> freqProductes= new LinkedList<FreqProductes>();

        for (int i = 0; i < productes.size(); i++) {
            freqProductes.add(new FreqProductes(productes.get(i),Collections.frequency(productes,productes.get(i))));

        }
        HashMap<FreqProductes, Integer> comprobarNoRepetidos =new HashMap<FreqProductes,Integer>();
        for (int i = 0; i < freqProductes.size(); i++) {
            comprobarNoRepetidos.put(freqProductes.get(i),freqProductes.get(i).p.getCodiDeBarres());
        }
      //  for (int i = 0; i < comprobarNoRepetidos.size(); i++) {
            System.out.println(""+ comprobarNoRepetidos.keySet().toString().replaceAll(", ",""));

        Map< Integer, FreqProductes > mp = new HashMap< Integer, FreqProductes>();
        for (int i = 0; i < freqProductes.size(); i++) {
            mp.put(freqProductes.get(i).p.getCodiDeBarres(),freqProductes.get(i));
        }

        Collections.sort(freqProductes
                , new Comparator<FreqProductes>() {
                    @Override
                    public int compare(FreqProductes o1, FreqProductes o2) {
                        if (o1.p.getCodiDeBarres() > o2.p.getCodiDeBarres()) return -1;
                        else if (o1.p.getCodiDeBarres() < o2.p.getCodiDeBarres()) return 1;

                        else return 0;                    }
                });
          String tiquet="";
        int codideBarres=0;
        double preu=0;
        ArrayList <FreqProductes> freqProductesFinal=new ArrayList<>();
        for (FreqProductes object : freqProductes){
            freqProductesFinal.add(object);
        }
        for (int i = 0; i < freqProductesFinal.size(); i++) {
            if (freqProductesFinal.get(i).p.getCodiDeBarres()==codideBarres)freqProductesFinal.remove(i);
        }
        System.out.println(freqProductesFinal.toString());
        Set <FreqProductes> repetitsNo = new HashSet<>(freqProductesFinal);
        tiquet+= repetitsNo.toString().replaceAll(", ","");


        return tiquet;
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


    public String imprimirCarroMap(List<Producte> carro) {
        String valorsDelMap="";
        Map<Integer, Producte> mp = new HashMap<Integer, Producte>();
        for (int i = 0; i < carro.size(); i++) {
            mp.put(carro.get(i).getCodiDeBarres(),carro.get(i));

        }
        for (int i = 0; i < carro.size(); i++) {
            valorsDelMap += mp.get(i)+"\n";

        }

        return valorsDelMap + "\n" ;
                //+ mp.toString().replaceAll(", ", "\n").replaceAll("}","");
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
    public String imprimirMapCarrito() {

        HashMap<Producte, Integer> comprobarNoRepetidos = new HashMap<Producte, Integer>();
        for (int i = 0; i < productes.size(); i++) {
            comprobarNoRepetidos.put(productes.get(i), productes.get(i).getCodiDeBarres());
        }
        System.out.println(comprobarNoRepetidos.keySet().size());
        String contingutMap = "";
       for (int i = 0; i < comprobarNoRepetidos.size(); i++) {
           if (!comprobarNoRepetidos.containsValue(productes.get(i).getCodiDeBarres())){
               comprobarNoRepetidos.keySet().clear();
           }

       }

           //    if (comprobarNoRepetidos.containsValue())
             contingutMap += ""+ comprobarNoRepetidos.keySet().toString().replaceAll(", ", "\n");
        System.out.println(contingutMap);

        return null;
    }
    public void contarFrecuenciaMap(){
        ArrayList<Integer>frequencia=new ArrayList<>();
        Map< Integer, Producte > mp = new HashMap< Integer, Producte>();

        for (int i = 0; i < productes.size(); i++) {
            frequencia.add(Collections.frequency(productes,productes.get(i)));
            mp.put(productes.get(i).getCodiDeBarres(),productes.get(i));
        }
      //  System.out.println(mp.keySet().toString());
        for (Producte producte: productes   ){
            System.out.println(mp.keySet());

        }
     //   System.out.println(mp.values());

      //  System.out.println(frequencia.toString());
    }

}
