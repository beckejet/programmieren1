package GenericInterfaceAufgabe3;

import java.util.LinkedList;
import java.util.Objects;


public class BetBooth {
    String name;
    double einsatz;
    double mult;
    void betStrength(int idx, double einsatz, LinkedList<Fighter> listFighter ){
        name = listFighter.get(idx).getName();
        this.einsatz = einsatz;
        mult = listFighter.get(idx).getStrength();
    }
    void checkBet(LinkedList<Fighter> listFighter){
        if (listFighter.getLast().getName().equals(name)){
            System.out.println("Du geile Sau hast die Wette und damit "+ Math.round( betStrengthMath()) + " Gold gewonnen!");
        }else
            System.out.println("Verloren: Nutze dein Geld lieber fuer Essen! Deine Familie hungert!");
    }
    Double betStrengthMath(){
        return einsatz = (einsatz * (1.25 +(1/mult)))-einsatz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetBooth betBooth = (BetBooth) o;
        return Double.compare(betBooth.einsatz, einsatz) == 0 &&
                Double.compare(betBooth.mult, mult) == 0 &&
                Objects.equals(name, betBooth.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, einsatz, mult);
    }
}
