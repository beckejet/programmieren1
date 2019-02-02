package Tier;

public class Katze extends Tier{
    private static final String sound = "Miau";
    public Katze(final String name){
        super(name);

    }
    @Override
    public void sprechen(){
        System.out.println(getName() + sound);
    }
}
