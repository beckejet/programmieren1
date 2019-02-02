package Tier;

import Tier.Tier;

public class Fisch extends WasserTiere {
     private static final String sound = "Blubb";

    public Fisch() {
    }

    public Fisch(final String name) {
        super(name);
    }

    @Override
    public void sprechen() {
        System.out.println(sagName() + sound);
    }

}
