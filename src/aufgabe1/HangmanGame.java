package aufgabe1;

class HangmanGame {

    enum State {
        BEGIN,
        CONFIGINPUT,
        LINEOUTPUT,
        GUESSINPUT,
        GUESSCOMPARE,

        YOULOSE,
        YOUWIN,
        DONE,
        END
    }

    State currentState = State.BEGIN;
    void begin(){
        HangmanStringCompare hangmanStringCompare = new HangmanStringCompare();

        while (true) {
            switch (currentState) {

                case BEGIN:
                    HangmanConfigurator.greet();
                    currentState = State.CONFIGINPUT;
                    break;

                case CONFIGINPUT:
                    hangmanStringCompare.setWordArrayCounter();
                    currentState = State.LINEOUTPUT;
                    break;

                case LINEOUTPUT:
                    hangmanStringCompare.showGuess();
                    currentState = State.GUESSINPUT;
                    break;

                case GUESSINPUT:
                    hangmanStringCompare.setGuessChar();
                    currentState = State.GUESSCOMPARE;
                    break;

                case GUESSCOMPARE:

                    hangmanStringCompare.guessArrayCompareArray();
                    int statusGame = hangmanStringCompare.gameStatus();

                    if (statusGame == 2) {
                        currentState = State.LINEOUTPUT;
                        break;
                    }else if (statusGame == 1){
                        currentState = State.YOUWIN;
                        break;
                    }
                    else currentState = State.YOULOSE;
                    break;

                case YOUWIN:
                    HangmanConfigurator.youWin();
                    currentState = State.DONE;
                    break;

                case YOULOSE:
                    HangmanConfigurator.youLose();
                    currentState = State.DONE;
                    break;

                case DONE:
                    boolean done = HangmanEnd.end();
                    if (done == true){
                        currentState =State.BEGIN;
                        break;
                    }else {
                        currentState = State.END;
                        break;

                    }

                case END:
                    HangmanConfigurator.goodbye();
                    return;

                default:
                    return;
            }
        }
    }
}
