package Tier;

public class Kuh extends LandTiere {

    private static final String sound = "Muuuh";

    public Kuh() {
    }

    public Kuh(final String name) {
        super(name);
    }

    @Override
    public void sprechen() {
        System.out.println(sagName() + sound);
    }
}