package aufgabe1;

class HangmanConfig {

    String word = "";
    int counter = 0;
    String guess = "";
    String end = "";


    void setWord(String word) {
        this.word = word;

    }

    String getWord() {
        return word;
    }
    void setCounter(int counter){
        this.counter = counter;
    }
    int getCounter(){
        return counter;
    }
     void setGuess(String guess) {
        int length = guess.length();
         if (length == 1) {
             this.guess = guess;
         } else if (length > 1) {
             System.out.println("Bitte nur ein Buchstabe eingeben: ");
         }
     }
     String getGuess(){
        return guess;
     }

}
