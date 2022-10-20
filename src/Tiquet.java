import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tiquet {
    public Tiquet(){
     Carro carro;

    }
    public String imprimirTiquet(List<Producte> productesCarro){

        Set<Producte> tiquet = new HashSet<>(productesCarro);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'   'HH':'mm");


        String tiquetString="          Tiquet del Supermercat SuperPuig\nData: "+ localDateTime.format(formatter)+"\n\n" +
                "      LLISTAT DE PRODUCTES            \n--------------------------------------------\n";

        for (int i = 0; i < tiquet.size(); i++) {


           tiquetString+= ""+ Collections.frequency(productesCarro, productesCarro.get(i))+" x   |  "+ productesCarro.get(i).toString()+"\n";
        }

        //Calcularem l'import total a pagar;
        double[] preuTotaldelsArticles = new double[productesCarro.size()];
        double cuantitatTotalPagar= 0;
        DecimalFormat df = new DecimalFormat("#.00");

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
