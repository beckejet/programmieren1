package Tier.petshop;

import Tier.*;

import java.util.LinkedList;
import java.util.List;

public class PetBasket {
    private List<Tier> petBasket = new LinkedList<Tier>();

    public PetBasket() {
    }

    public List<Tier> getPetBasket() {
        return this.petBasket;
    }

    public boolean addPetToBasket(String type, String name) {
        switch (type) {
            case ("hund"):
                petBasket.add(new Hund(name));
                break;
            case ("fisch"):
                petBasket.add(new Fisch(name));
                break;
            default:
                return false;
        }
        return true;
    }

}
