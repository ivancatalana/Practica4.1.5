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
        System.out.printf(carro.productes.toString()+ "\n");
        return null;
    }
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
            else if (option == 2){
                System.out.println("2");
            }
            else if (option == 3){
                toString();
            }
            else if (option == 4){
                menuOpt=false;
            }
            else {
                System.out.println("Opcion incorrecta");
            }
        }
    }

}
