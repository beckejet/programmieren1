package Glueckspiel;

import java.util.Collection;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class EuroJackpot {

    SortedSet<Integer> jackpotList = new TreeSet<>();



    private final double preis = 0.85;
    private Random r = new Random();

    void erzeugeFeld(){
        jackpotList.clear();
        while(jackpotList.size() != 5){
            jackpotList.add(r.nextInt(50)+1);
        }
        jackpotList.forEach(l-> System.out.print(l+" "));
    }
    void erzeugeFelder(int auswahl){
        for(int i = 1 ; i<=auswahl; i++){
            System.out.print("Feld " + i + ": ");
            erzeugeFeld();
            System.out.println();
        }
    }
    public double getPreis() {
        return preis;
    }


}
