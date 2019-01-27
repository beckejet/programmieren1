package aufgabe1;

public class HangmanGame {
    final String yes = "y";
    HangmanConfigurator hangmanConfigurator = new HangmanConfigurator();


    enum State {
        BEGIN,
        WORDINPUT,
        COUNTERINPUT,
        LINEOUTPUT,
        GUESSINPUT,
        QUESSCOMPARE,
        YOULOSE,
        YOUWIN,
        DONE,
        END
    }

    State currentState = State.BEGIN;
    public void begin(){

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
                    currentState = State.YOUWIN;
                    break;

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
