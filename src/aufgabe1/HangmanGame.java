package aufgabe1;

class HangmanGame {

    HangmanConfigurator hangmanConfigurator = new HangmanConfigurator();


    enum State {
        BEGIN,
        WORDINPUT,
        COUNTERINPUT,
        LINEOUTPUT,
        GUESSINPUT,
        QUESSCOMPARE,
        CHECKGAME,
        YOULOSE,
        YOUWIN,
        DONE,
        END
    }

    State currentState = State.BEGIN;
    void begin(){

        while (true) {
            switch (currentState) {
                case BEGIN:
                    hangmanConfigurator.greet();
                    currentState = State.WORDINPUT;
                    break;

                case WORDINPUT:
                    hangmanConfigurator.input();
                    currentState = State.COUNTERINPUT;
                    break;
                case COUNTERINPUT:
                    hangmanConfigurator.counterInput();
                    currentState = State.LINEOUTPUT;
                    break;

                case LINEOUTPUT:
                    hangmanConfigurator.lineLength();
                    currentState = State.GUESSINPUT;
                    break;

                case GUESSINPUT:
                    hangmanConfigurator.guessChar();
                    currentState = State.QUESSCOMPARE;
                    break;

                case QUESSCOMPARE:
                    hangmanConfigurator.compareChar();
                    currentState = State.CHECKGAME;
                    break;

                case CHECKGAME:
                    int checkGame = hangmanConfigurator.checkGame();
                    System.out.println(checkGame);
                    if (checkGame == 2){
                        currentState = State.YOUWIN;
                        break;}
                    else if ( checkGame == 0){
                        currentState = State.YOULOSE;
                    break;}
                    else if( checkGame == 1){
                        currentState = State.LINEOUTPUT;
                     break;
                    }
                case YOUWIN:
                    hangmanConfigurator.youWin();
                    currentState = State.DONE;

                    break;

                case YOULOSE:
                    hangmanConfigurator.youLose();
                    currentState = State.DONE;
                    break;
                case DONE:
                    boolean done = hangmanConfigurator.end();
                    if (done == true){
                        currentState =State.BEGIN;
                        break;
                    }else {
                    currentState = State.END;
                    break;
                }



                case END:
                    return;

                default:
                    return;
            }
        }
    }
}
