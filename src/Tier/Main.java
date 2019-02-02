package Tier;

public class Main {
    public static void main(String[] args){
                Tier nemo = new Fisch("Nemo");
                Tier pako = new Hund("Pako");
                Tier mieze =new Katze("Mieze");
                Tier ella= new Kuh("Ella");

        Tier[] tiere = {
                nemo,
                pako,
                mieze,
                ella
        };

        for (Tier tier :tiere ){
            tier.sprechen();
            //nemo.sprichMit(mieze);
        }
    }
}
