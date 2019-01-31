package aufgabe1;
import java.util.Scanner;
public class HangmanEnd {
    static String player = "Spieler 1 ";
    static String  guesser = "Spieler 2 ";

    static boolean end(){
        Scanner input = new Scanner(System.in);
        System.out.println("Noch einmal spielen und Spieler wechseln(y/n) ");
        String choice = input.next();
        if (choice.equals("y")){
            setSpieler();
            return true;
        }else return false;
    }
    static void setSpieler() {
        String temp = player;
        player = guesser;
        guesser = temp;
    }
    static String getPlayer(){
        return player;
    }
    static String getGuesser(){
        return guesser;
    }
}
