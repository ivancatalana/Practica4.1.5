import java.util.Scanner;

public class Menu {
        Scanner scanner=new Scanner(System.in);
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
       public Alimentacio alimentacio (){
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
           return aliment;



       }
}
