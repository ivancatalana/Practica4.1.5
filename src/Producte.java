public class Producte {
      private int preu;
      private String nom;
      private int codiDeBarres;



      public Producte(int preu, String nom, int codiDeBarres){
            this.preu=preu;
            this.nom=nom;
            this.codiDeBarres=codiDeBarres;
      }

      public Producte() {

      }

      @Override
      public String toString() {
            return "Producte{" +
                    "preu=" + preu +
                    ", nom='" + nom + '\'' +
                    ", codiDeBarres=" + codiDeBarres +
                    '}';
      }
}
