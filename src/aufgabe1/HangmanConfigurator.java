package aufgabe1;

import java.util.Scanner;
import java.text.Collator;

public class HangmanConfigurator {
    HangmanConfig hangmanConfig = new HangmanConfig();
    Scanner input = new Scanner(System.in);

    void greet() {
        System.out.println("****************************");
        System.out.println("Welcome to the Game HANGMAN ");
        System.out.println("****************************");
    }

    void input() {
        System.out.println("Spieler 1: Geben sie ihr Wort ein: ");
        String word = input.next();
        hangmanConfig.setWord(word);

    }
    void counterInput(){
        System.out.println("Wie oft darf Spieler2 es versuchen?");
        int counter = input.nextInt();
        hangmanConfig.setCounter(counter);
    }
    void lineLength(){
        System.out.println("Spieler 2: So viele Zeichen hat das Wort: ");
        String wordString = hangmanConfig.getWord();
        for (int i = 0; i < wordString.length() ; i++){
            System.out.print("_ ");
        }
        System.out.println();
        System.out.println("Du hast " + hangmanConfig.getCounter() + " Versuche!, Viel Glueck!");
    }
    void guessChar() {
        String guess = input.next();
        hangmanConfig.setGuess(guess);
        int counter = hangmanConfig.getCounter();
        for (int i = 0; i <= counter; i++) {
            compareChar();


        }
    }
    void compareChar(){
        String compare = hangmanConfig.getGuess();
        System.out.println("CompareChar");
        String word = hangmanConfig.getWord();
        System.out.println(word);
        int same = word.compareToIgnoreCase(compare);
        System.out.println(same);
        if (same == 2){
            guessChar();
        }

    }
    void youWin(){
        System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten.");
    }
    void youLose(){
        System.out.println("Schade du hast verloren! ");

    }
    boolean end(){
        System.out.println("Nocheinmal spielen? ");
        String choice = input.next();
        if (choice.equals("y")){
            return true;
        }else return false;


    }
}

