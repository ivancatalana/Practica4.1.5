import java.util.*;

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
           double preu=scanner.nextDouble();
           scanner.nextLine();
           System.out.printf("Nom?");
           String nom=scanner.nextLine();
           System.out.printf("Codi de barres?");
           int codiDeBarres=scanner.nextInt();
           scanner.nextLine();
           System.out.printf("Dies per complir caducitat?");
           int diesDeCaducitat=scanner.nextInt();
           Alimentacio aliment = new Alimentacio(preu,nom,codiDeBarres,diesDeCaducitat);
           aliment.diesCaducitat(diesDeCaducitat);
           carro.afegirProducte(aliment);
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
        carro.afegirProducte(textil);
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
        electronica.preuDiesGarantia(diesGarantia);
        carro.afegirProducte(electronica);

    }
    public String toString(){
        System.out.printf(carro.getProductes().toString()+ "\n");
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
            else if (option == 3) {
                System.out.println(carro.mostrarCarro());
                Set<Producte> freq = new HashSet<>(carro.getProductes());

                for (Producte l: carro.getProductes()){
                    System.out.println(Collections.frequency(carro.getProductes(),l));
                }
                System.out.println("Repetits NO: ");
                carro.repetitsNo();
                Set<Producte> repetitsNo = new HashSet<>(carro.getProductes());

                System.out.println("\nRepetits NO amb cuantitat : ");

                for (int i = 0; i < repetitsNo.size(); i++) {


                    System.out.println("cuantitat: "+Collections.frequency(carro.getProductes(), carro.getProductes().get(i))+" tipus de producte: "+ carro.getProductes().get(i).toString());
                }
                System.out.println(carro.mostrarCarro());
                Tiquet tiquet = new Tiquet();
                System.out.println(tiquet.imprimirTiquet(carro.getProductes()));

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
