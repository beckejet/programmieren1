package Glueckspiel;

import java.util.Collection;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class LottoFeldGenerator {
    SortedSet<Integer> lottoList = new TreeSet<>();

    private final double preis = 1.25;

    private Random r = new Random();

    void erzeugeFeld(){
        lottoList.clear();
        while(lottoList.size() != 6){
            lottoList.add(r.nextInt(49)+1);
        }
        lottoList.forEach(l-> System.out.print(l+" "));
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
