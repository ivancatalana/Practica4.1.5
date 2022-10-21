import java.util.Comparator;
import java.util.Objects;

public class Producte implements Comparator<Producte> {
      private double preu;
      private String nom;
      private int codiDeBarres;


      public Producte(double preu, String nom, int codiDeBarres){
            this.preu=preu;
            this.nom=nom;
            this.codiDeBarres=codiDeBarres;
      }

      public Producte() {

      }
      public double getPreu() {
            return preu;
      }

      public void setPreu(double preu) {
            this.preu = preu;
      }
      public String getNom() {
            return nom;
      }

      public void setNom(String nom) {
            this.nom = nom;
      }
      public int getCodiDeBarres() {
            return codiDeBarres;
      }

      public void setCodiDeBarres(int codiDeBarres) {
            this.codiDeBarres = codiDeBarres;
      }

      @Override
      public String toString() {
            return "Producte{" +
                    "preu=" + preu +
                    ", nom='" + nom + '\'' +
                    ", codiDeBarres=" + codiDeBarres +
                    '}';
      }

      @Override
      public int compare(Producte o1, Producte o2) {

            return 0;
      }
      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Producte producte = (Producte) o;
            return Double.compare(producte.preu, preu) == 0 && codiDeBarres == producte.codiDeBarres;
      }

      @Override
      public int hashCode() {
            return Objects.hash(preu, codiDeBarres);
      }
}
