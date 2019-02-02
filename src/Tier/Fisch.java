package Tier;

public class Fisch extends Tier {
     private static final String sound = "Blubb";

     public Fisch(final String name) {
        super(name);
    }

    @Override
    public void sprechen() {
        System.out.println(getName() + sound);
    }
}
