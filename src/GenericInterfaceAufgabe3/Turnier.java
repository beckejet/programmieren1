package GenericInterfaceAufgabe3;

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class Turnier{
    double noFights ;
    int roundNo =1;
    LinkedList<Fighter> listFighter = new LinkedList<>();
    LinkedList<Fighter> listWinner = new LinkedList<>();
    BetBooth betBooth = new BetBooth();



    public Turnier registerFighter(Fighter fighter){
        listFighter.add(fighter);
        return this;
    }
    Fighter versus(Fighter attacker, Fighter defender){
        if (attacker.getStrength() > defender.getStrength()) {
            attacker.absorbStrength(defender);
            return attacker;
        } else {
            defender.absorbStrength(attacker);
           return defender;
        }
    }

    Turnier startFight() {
        Collections.shuffle(listFighter);
        Commentator.greet();
        Commentator.introFighter(listFighter);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Auf welchen Kaempfer (index) wollen sie wetten? ");
        int index = input.nextInt();
        System.out.print("Wieviel möchten sie wetten? ");
        double einsatz = input.nextDouble();
        betBooth.betStrength(index, einsatz, listFighter);
        input.close();
        Collections.shuffle(listFighter);
        noFights = Math.log(listFighter.size())/Math.log(2);
        if (listFighter.size() % 4 == 0) {
            for(int j = 0; j < noFights ; j+=0) {
                Commentator.nextRound(roundNo);
                for (int i = 0; i < listFighter.size(); i+=2) {
                    Commentator.fightComment(listFighter.get(i), listFighter.get(i+1));
                    listWinner.add(versus(listFighter.get(i), listFighter.get(i + 1)));
                    Commentator.announceWinner(listWinner, noFights);
                }
                nextRound();
            }
            betBooth.checkBet(listFighter);
        }else System.out.println("Bitte gib eine Fighter Anzahl die durch vier teilbar ist....");
        return this;
    }

    private void nextRound() {
        listFighter.clear();
        listFighter.addAll(listWinner);
        listWinner.clear();
        noFights --;
        roundNo++;
    }
}