import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tiquet {
    public Tiquet(){
    }
    public String imprimirTiquet(List<Producte> productesCarro){

        Collections.sort(productesCarro
                , new Comparator<Producte>() {
                    @Override
                    public int compare(Producte o1, Producte o2) {
                        if (o1.getCodiDeBarres() > o2.getCodiDeBarres()) return -1;
                        else if (o1.getCodiDeBarres() < o2.getCodiDeBarres()) return 1;

                        else return 0;                    }
                });
        Set<Producte> tiquet = new HashSet<>(productesCarro);
         tiquet.addAll(productesCarro);
        int codideBarres=0;

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'   'HH':'mm");
        DecimalFormat df = new DecimalFormat("#.00");


        String tiquetString="          Tiquet del Supermercat SuperPuig\nData: "+ localDateTime.format(formatter)+"\n\n" +
                "      LLISTAT DE PRODUCTES            \n--------------------------------------------\n";
        for (int i = 0; i < productesCarro.size(); i++) {

            if (productesCarro.get(i).getCodiDeBarres() != codideBarres) {
                codideBarres=productesCarro.get(i).getCodiDeBarres();
                tiquetString += "" + Collections.frequency(productesCarro, productesCarro.get(i)) + " x   |  Import Total= "+df.format(productesCarro.get(i).getPreu()*Collections.frequency(productesCarro, productesCarro.get(i)))+ "  |  "+productesCarro.get(i).toString() + "\n";
            }
        }
        //Calcularem l'import total a pagar;
        double[] preuTotaldelsArticles = new double[productesCarro.size()];
        double cuantitatTotalPagar= 0;

        for (int i = 0; i < productesCarro.size(); i++) {
            preuTotaldelsArticles[i] = productesCarro.get(i).getPreu();
        }
        for (int i = 0; i < preuTotaldelsArticles.length; i++) {
            cuantitatTotalPagar += preuTotaldelsArticles[i];

        }
        tiquetString+= "\nTOTAL A PAGAR :   "+ df.format(cuantitatTotalPagar) + "\n";

            return tiquetString;
    }

}
