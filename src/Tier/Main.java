package Tier;

import Tier.petshop.Tierhandlung;

public class Main {

    public static void main(String[] args) {

        Tier[] tiere = {
                new Katze(),
                new Hund(),
                new Kuh(),
                new Fisch()
        };

        Tier[] tiereMitNamen = {
            new Fisch("Nemo"),
            new Hund("Pako"),
            new Katze("Mieze"),
            new Kuh("Ella")
        };

        for (Tier tier : tiere) {
            tier.sprechen();
        }

        System.out.println();

        for (Tier tier : tiereMitNamen) {
            tier.sprechen();
        }

        System.out.println("############### 1.2 ##################### \n");

        Tier nemo = new Fisch("Nemo");
        Tier pako = new Hund("Pako");
        Tier mieze =new Katze("Mieze");
        Tier ella= new Kuh("Ella");

        nemo.sprichMit(pako);
        mieze.sprichMit(ella);

        System.out.println("############### 1.3 ##################### \n");

        Tier hai = new Hai("Hai");

        mieze.spieleMit(pako);
        nemo.spieleMit(ella);
        ella.spieleMit(hai);
        nemo.spieleMit(hai);

        System.out.println("############### 1.4 ##################### \n");

        Tierhandlung tierhandlung = new Tierhandlung();
        tierhandlung.startPetShop();
    }
}
