public class Main {
    public static void main(String[] args) {
        Menu menu =new Menu();
       boolean menuOpt=false;
       while (!menuOpt){
           if (menu.principal()==1){
               if (menu.producte()==1)menu.alimentacio();
           }
           else if (menu.principal()==2) ;
           else if (menu.principal()==3)menuOpt=true;
           else if (menu.principal()==4)menuOpt=true;
       }
    }
}