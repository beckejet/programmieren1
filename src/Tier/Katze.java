package Tier;

import Tier.LandTiere;

public class Katze extends LandTiere {
    private static final String sound = "Miau";

    public Katze() {
    }

    public Katze(final String name){
        super(name);
    }

    @Override
    public void sprechen() {
        System.out.println(sagName() + sound);
    }
}
