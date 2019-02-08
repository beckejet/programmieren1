package Glueckspiel;
import java.util.Scanner;
public class Losverkaeufer {
    Scanner input = new Scanner(System.in);
    LottoFeldGenerator lottoFeldGenerator = new LottoFeldGenerator();
    EuroJackpot euroJackpot = new EuroJackpot();
    Rubbellos rubbellos =new Rubbellos();

    void greet(){
        System.out.println("Welches Los wollen sie kaufen?");
        System.out.println("[1] Lotto ("+ lottoFeldGenerator.getPreis()+ " Euro/Feld)");
        System.out.println("[2] Euro Jackpot ("+ euroJackpot.getPreis()+ " Euro/Feld)");
        System.out.println("[3] Rubbellos ("+ rubbellos.getPreis()+ " Euro/Feld)");
        int auswahl = input.nextInt();
        losVerkauf(auswahl);
        }
    double getPreisGesamt(double preis, int auswahl2){
        double preisGesamt = preis * auswahl2;
        return preisGesamt;
    }
    void fehler(){
        System.out.println("Bitte eine gegebene Zahl einggeben.");
        greet();
    }

    void losVerkauf(int auswahl){
        if (auswahl > 3|| auswahl == 0) {
           fehler();

        }else {
            System.out.println("Wieviele Felder wollen sie spielen? ");
            int auswahl2 = input.nextInt();

            if (auswahl == 1) {
                System.out.println("Lottoschein : (");
                lottoFeldGenerator.erzeugeFelder(auswahl2);
                System.out.printf("\nDer Preis betraegt %.2f Euro ", getPreisGesamt(lottoFeldGenerator.getPreis(), auswahl2));
            } else if (auswahl == 2) {
                System.out.println("Eurojackpot: ");
                euroJackpot.erzeugeFelder(auswahl2);
                System.out.printf("\nDer Preis betraegt %.2f Euro ", getPreisGesamt(euroJackpot.getPreis(), auswahl2));
            } else if (auswahl == 3) {
                System.out.printf("Rubbellos: ");
                rubbellos.erzeugeFelder(auswahl2);
                System.out.printf("\nDer Preis betraegt %.2f Euro", getPreisGesamt(rubbellos.getPreis(), auswahl2));
            }
        }
    }
}
