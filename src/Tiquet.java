import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Tiquet {
    public Tiquet(){
     Carro carro;

    }
    public String imprimirTiquet(List carro){

        Set<Producte> tiquet = new HashSet<>(carro);

        String tiquetString="Tiquet del Supermercado Aldi\nFecha Actual: "+ LocalDate.now()+ " "+ LocalTime.now() +"\n";

        for (int i = 0; i < tiquet.size(); i++) {


           tiquetString+= "cuantitat: "+ Collections.frequency(carro, carro.get(i))+" tipus de producte: "+ carro.get(i).toString()+"\n";
        }
        return tiquetString;
    }

}
