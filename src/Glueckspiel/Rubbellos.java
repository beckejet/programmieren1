package Glueckspiel;

import java.util.*;

public class Rubbellos{
    LinkedList<String> rubbelList = new LinkedList<>();


    private final double preis = 2.0;
    void erzeugeFeld(){
        rubbelList.clear();
        while(rubbelList.size() != 9){
            rubbelList.add("*");
        }
        rubbelList.forEach(l-> System.out.print(l+" "));
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