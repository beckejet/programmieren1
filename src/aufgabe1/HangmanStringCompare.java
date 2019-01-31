package aufgabe1;

import java.util.Arrays;
import java.util.Scanner;

class HangmanStringCompare {
    char[] wordArray;
    int counter;
    int countertemp;
    char guessChar;
    char[] compareCharArray;

    Scanner input = new Scanner(System.in);
    HangmanConfigurator hangmanConfigurator;

    void setWordArrayCounter() {
        System.out.println(HangmanEnd.getPlayer() + " Geben sie ihr Wort ein: ");
        String wordArrayString  = input.next();
        char[] wordArray = wordArrayString.toCharArray();
        System.out.println("Wie oft darf " + HangmanEnd.getGuesser() + "es versuchen?");
        int counter = input.nextInt();
        this.counter = counter;
        this.wordArray = wordArray;
        setCompareCharArray();
    }

    void setCompareCharArray() {
        char[] compareCharArray = new char[wordArray.length];
        for (int i = 0; i< wordArray.length; i++){
            compareCharArray[i] = '_';
        }
        this.compareCharArray = compareCharArray;
    }

    void setGuessChar() {
        char[] guessCharArray = input.next().toCharArray();
        char guessChar = guessCharArray[0];
        this.guessChar = guessChar;
    }

    void showGuess(){
        for (int i = 0; i < compareCharArray.length; i++){
            System.out.print(compareCharArray[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Du hast: " +counter+ " Versuch(e)");
    }

    void guessArrayCompareArray() {

        countertemp = wordArray.length;
        for (int i = 0; i < wordArray.length; i++) {
            if (guessChar == wordArray[i]) {
                compareCharArray[i] =  guessChar;
            }else countertemp --;
        }
    }

    int gameStatus() {
        if (countertemp < 1){
            counter = counter -1;
        }

        boolean compare = Arrays.equals(wordArray, compareCharArray);
        if (counter > 1 && !compare) {
                return 2;
            }
            else if (counter> 1 && compare) {
                return 1;
            }
        else return 0;

    }
}




