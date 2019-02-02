package Tier;

public class Hund extends Tier {
    private static final String sound = "Wau Wau";

    public Hund(final String name) {
        super(name);

    }

    @Override
    public void sprechen() {
        System.out.println(sound);
    }

    /*@Override
    public void sprichMit(Tier tier) {
        System.out.println(getName(pako) + getTier());

    }*/
}
