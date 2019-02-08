package GenericInterfaceAufgabe3;

import java.util.LinkedList;

public class Commentator {
    static void greet(){

        System.out.println("****************************");
        System.out.println("* Servus zum RitterTurnier *");
        System.out.println("****************************\n\n");
    }

    static void introFighter(LinkedList<Fighter> listFighter){

        listFighter.forEach((f)-> System.out.println("(" + listFighter.indexOf(f) + ") "  + f.getName() + " tritt dem Kampf bei, die Stärke beträgt: " + Math.round(f.getStrength())));
    }

    static void fightComment(Fighter attacker, Fighter defender){
        System.out.println(attacker.getName() + " kaempft gegen: " +defender.getName());
    }

    static void announceWinner(LinkedList<Fighter> listWinner, double noRound){

        System.out.println(listWinner.getLast().getName() + " hat den Kampf gewonnen. Die neue Stärke betraegt: " + Math.round(listWinner.getLast().getStrength())+"\n");

        if(listWinner.size()==1 && noRound == 1.0) {
            System.out.println("\n#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+");
            System.out.println(listWinner.get(0).getName() + " hat das Turnier gewonnen. Die Stärke beträgt: " + Math.round(listWinner.get(0).getStrength()));
            System.out.println("#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+#+");
        }
    }
    static void nextRound(int roundNo){

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Runde: " + roundNo+ "\n");
    }


}
