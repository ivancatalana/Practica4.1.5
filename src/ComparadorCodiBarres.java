import java.util.Comparator;

public class ComparadorCodiBarres implements Comparator<Producte> {
    @Override
    public int compare(Producte c1, Producte c2) {
        if(c1.getCodiDeBarres()== c2.getCodiDeBarres()) return -1;
        else return 0;
    }

}
