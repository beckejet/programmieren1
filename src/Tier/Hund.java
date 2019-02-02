package Tier;

public class Hund extends LandTiere {
    private static final String sound = "Wau Wau";

    public Hund() {
    }

    public Hund(final String name) {
        super(name);
    }

    @Override
    public void sprechen() {
        System.out.println(sagName() + sound);
    }

}
