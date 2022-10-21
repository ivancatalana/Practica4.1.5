import java.util.*;

public class Menu {
        Scanner scanner=new Scanner(System.in);
        Carro carro=new Carro();

// Metode per crear el menu principal
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
    // Metode per crear el menu per crear un producte

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
    // Metode per crear el menu per crear un producte d'alimentació

    public void alimentacio (){
           System.out.printf("Preu?\n");
           double preu=scanner.nextDouble();
           scanner.nextLine();
           System.out.printf("Nom?\n");
           String nom=scanner.nextLine();
           System.out.printf("Codi de barres?\n");
           int codiDeBarres=scanner.nextInt();
           scanner.nextLine();
           System.out.printf("Dies per complir caducitat?\n");
           int diesDeCaducitat=scanner.nextInt();
           Alimentacio aliment = new Alimentacio(preu,nom,codiDeBarres,diesDeCaducitat);
           aliment.diesCaducitat(diesDeCaducitat);
           carro.afegirProducte(aliment);
       }

       // Metode per crear el menu per crear un producte textil

    public void textil () {
        System.out.printf("Preu?\n");
        int preu = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Nom? \n");
        String nom = scanner.nextLine();
        System.out.printf("Codi de barres? \n");
        int codiDeBarres = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Composició textil?\n");
        String composicio = scanner.nextLine();
        Textil textil = new Textil(preu, nom, codiDeBarres, composicio );
        carro.afegirProducte(textil);
    }
    // Metode per crear el menu per crear un producte d'electronica

    public void electronica () {
        System.out.printf("Preu?\n");
        int preu = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Nom?\n");
        String nom = scanner.nextLine();
        System.out.printf("Codi de barres?\n");
        int codiDeBarres = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Dies de garantia?\n");
        int diesGarantia = scanner.nextInt();
        Electronica electronica = new Electronica(preu, nom, codiDeBarres, diesGarantia );
        electronica.preuDiesGarantia(diesGarantia);
        carro.afegirProducte(electronica);

    }

    public String toString(){
        System.out.printf(carro.getProductes().toString()+ "\n");
        return null;
    }
    // Metode per crear el menu a un bucle i anar fent l'us del programa

    public void start() {
        boolean menuOpt = true;
        int option;
            while (menuOpt){
            option= principal();
            if (option == 1) {
                int optionProducte;
                  optionProducte=producte();
                if (optionProducte == 1){
                    alimentacio();
                }
                else if (optionProducte == 2){
                    textil();
                }
                else if (optionProducte == 3){
                    electronica();
                }
                else if (optionProducte == 4){
                      continue;
                }
            }
            //Aquí cuan demanem pagar i buidar el carro
            else if (option == 2){
                Tiquet tiquet = new Tiquet();
                System.out.println(tiquet.imprimirTiquet(carro.getProductes()));
                carro.getProductes().removeAll(carro.getProductes());
            }
            else if (option == 3) {

                System.out.println("Mostramos Carro");
               // carro.imprimirMapCarrito();
               // carro.contarFrecuenciaMap();
            //    System.out.println(carro.imprimirCarroMap(carro.getProductes()));
               // System.out.println(carro.tiquet());
                System.out.println(carro.mostrarProductesFrequenciaCarro());

            }
            else if (option == 4){
                menuOpt=false;
            }
            else {
                System.out.println("Opció incorrecta");
            }
        }
    }
}
