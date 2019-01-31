package aufgabe1;

class HangmanConfigurator{

    static void greet() {
        System.out.println("*******************************");
        System.out.println("* Welcome to the Game HANGMAN *");
        System.out.println("*******************************");
    }

    static void youWin(){
        System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten!");
    }

    static void youLose(){
        System.out.println("Schade, du hast verloren!");
    }
    static void goodbye(){
        System.out.println("Schade, dass du nicht mehr spielen willst :( ");
        System.out.println("Einen schönen Tag noch! :)");
    }
}

