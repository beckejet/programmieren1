package GenericInterfaceAufgabe3;



public abstract class Fighter{
    double strength;
    String name;

    Fighter(String name) {
            this.name = name;
            strength = Math.random() * 100;
    }

    public String getName() {
        return name;
    }

    public double getStrength(){
        return strength;
    }

    public void absorbStrength(Fighter fighter){
        this.strength += fighter.strength;

    }
}
