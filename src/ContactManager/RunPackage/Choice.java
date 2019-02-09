package ContactManager.RunPackage;

import java.util.Scanner;

public class Choice {
    public static void getChoice(){
        Scanner input = new Scanner(System.in);
        System.out.print("->");
        while(true){
            switch(input.next().toUpperCase()){
                case("A"):
                    System.out.println("Alle Kontakte anzeigen");
                    break;
                case("N"):
                    System.out.println("Neuer Kontakt anlegen");
                    break;
                case("K"):
                    System.out.println("Kontakt bearbeiten");
                    break;
                case("D"):
                    System.out.println("Kontakt Details anzeigen");
                    break;
                case("L"):
                    System.out.println("Kontakt loeschen");
                    break;
                case("B"):
                    System.out.println("Beenden");
                    break;
                    default: return;


            }
        }
    }
}
