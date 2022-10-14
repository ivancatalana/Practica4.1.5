import java.util.Scanner;

public class Menu {
        Scanner scanner=new Scanner(System.in);
        Carro carro=new Carro();
       public int principal(){
           System.out.printf("1. Introduir producte\n" +
                   "2. Passar per caixa\n"+
                   "3. Mostrar carro de la compra\n"+
                   "4. Sortir\n"
           );
           int option= scanner.nextInt();
           scanner.nextLine();
           return option;
       }
       public int producte(){
           System.out.printf("1. Alimentació\n" +
                   "2. Tèxtil\n"+
                   "3. Electrònica\n"+
                   "4. Tornar\n"
           );
           int option = scanner.nextInt();
           scanner.nextLine();
           return option;
       }
       public void alimentacio (){
           System.out.printf("Preu?");
           int preu=scanner.nextInt();
           scanner.nextLine();
           System.out.printf("Nom?");
           String nom=scanner.nextLine();
           System.out.printf("Codi de barres?");
           int codiDeBarres=scanner.nextInt();
           scanner.nextLine();
           System.out.printf("Data de caducitat?");
           int diesDeCaducitat=scanner.nextInt();
           Alimentacio aliment = new Alimentacio(preu,nom,codiDeBarres,diesDeCaducitat);
           carro.productes.add(aliment);
       }
    public void textil () {
        System.out.printf("Preu?");
        int preu = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Nom?");
        String nom = scanner.nextLine();
        System.out.printf("Codi de barres?");
        int codiDeBarres = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Composició textil?");
        String composicio = scanner.nextLine();
        Textil textil = new Textil(preu, nom, codiDeBarres, composicio );
        carro.productes.add(textil);
    }
    public void electronica () {
        System.out.printf("Preu?");
        int preu = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Nom?");
        String nom = scanner.nextLine();
        System.out.printf("Codi de barres?");
        int codiDeBarres = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Dies de garantia?");
        int diesGarantia = scanner.nextInt();
        Electronica electronica = new Electronica(preu, nom, codiDeBarres, diesGarantia );
        carro.productes.add(electronica);

    }
    public String toString(){
        System.out.printf(carro.productes.toString());
        return null;
    }
    public void start() {
        boolean menuOpt = true;
        while (menuOpt) {
            if (principal() == 1) {
                if (producte() == 1) alimentacio();
                else if (producte() == 2) textil();
                else if (producte() == 3) electronica();
            } else if (principal() == 2) System.out.println("2");
            else if (principal() == 3) toString();
            else if (principal() == 4) menuOpt = false;
            else System.out.println("Opcion incorrecta");
        }
    }

    }
