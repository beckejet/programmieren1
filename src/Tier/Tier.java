package Tier;

abstract public class Tier {

    private String name;
    private Tier tier;

    public Tier(final String name){
        this.name = name;
    }
    abstract void sprechen();

    //protected abstract void sprichMit(Tier tier);

    protected String getName(){
        return name;
    }





}
