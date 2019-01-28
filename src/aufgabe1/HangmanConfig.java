package aufgabe1;

class HangmanConfig {

    String word = "";
    int counter = 0;
    String guess = "";
    char[] lineWord ;


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

         if (guess.length() == 1) {
             this.guess = guess;
         } else {
             System.out.println("Bitte nur ein Buchstabe eingeben: ");
             return;
         }
     }
     String getGuess(){
        return guess;
     }
     void setLineWord(String lineWordString){
        char[] lineWord  = lineWordString.toCharArray();
        this.lineWord = lineWord;

     }
     char[] getLineWord(){
        return lineWord;
     }

}
