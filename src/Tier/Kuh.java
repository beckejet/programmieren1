package Tier;

public class Kuh extends Tier{
    private static final String sound = "Muuuh";
    public Kuh(final String name){
        super(name);


    }
    @Override
    public void sprechen(){
        System.out.println(getName()+ sound);
    }
    /*@Override
    public Tier sprichMit(tier){
        System.out.println();
    }*/
}