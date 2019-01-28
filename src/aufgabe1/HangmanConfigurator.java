package aufgabe1;

import java.util.Scanner;

class HangmanConfigurator {
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
        System.out.println("Spieler 2: Das Wort hat " + hangmanConfig.getWord().length() + " Zeichen" );
        System.out.println("Du hast " + hangmanConfig.getCounter() + " Versuche!, Viel Glueck!");
        String temp = hangmanConfig.getWord();
        hangmanConfig.setLineWord(temp);
        char [] lineWord = hangmanConfig.getLineWord();
        for (int i = 0; i < lineWord.length ; i++){
            lineWord[i] = '_';
            System.out.print(lineWord[i]);
            System.out.print(" ");
        }
        System.out.println();


    }
    void guessChar() {
        String guess = input.next();
        hangmanConfig.setGuess(guess);
    }

    void compareChar(){
        char [] word = hangmanConfig.getWord().toCharArray();
        char[] compare = hangmanConfig.getGuess().toCharArray();
        for  (int i = 0; i <= compare.length -1; i++) {
            if (compare[0] == word[i]) {
                char[] lineWord = hangmanConfig.getLineWord();
                lineWord[i] = compare[0];
                hangmanConfig.setLineWord(lineWord.toString());
                System.out.println(lineWord);
            }
        }
    }
    int checkGame() {
        char[] word = hangmanConfig.getWord().toCharArray();
        char[] lineWord = hangmanConfig.getLineWord();

        int counter = hangmanConfig.getCounter();
        counter--;
        hangmanConfig.setCounter(counter);
        System.out.println(counter);
        if ((word == lineWord) && (counter > 0)){
            return 2;

        }else if((word!= lineWord) && (counter == 0)){
            return 0;} else  if ((lineWord != word )&& (counter > 0)) {
            return 2;}
        return 5;

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

