package Tier;

abstract public class Tier {

    private String name;

    public abstract void sprechen();

    public Tier() {
    }

    public Tier(String name){
        this.name = name;
    }

    protected String sagName() {
        return name == null ? "" :  name + " sagt: ";
    }

    protected void sprichMit(Tier tier) {
        for (int i = 0; i < 2; i++) {
            this.sprechen();
            tier.sprechen();
        }
        System.out.println();
    }

    public void spieleMit(Tier tier) {
        if (this.getClass().getSuperclass() == tier.getClass().getSuperclass()) {
            System.out.println(name + " spielt mit: " + tier.name + " :)");
        } else {
            System.out.println(name + " kann nicht mit: " + tier.name + " spielen :(");
        }
    }
}
