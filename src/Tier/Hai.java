package Tier;

import Tier.Tier;

public class Hai extends WasserTiere {
    private static final String sound = "Blubb";

    public Hai() {
    }

    public Hai(final String name) {
        super(name);
    }

    @Override
    public void sprechen() {
        System.out.println(sagName() + sound);
    }

}
