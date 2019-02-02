package Tier.petshop;

import Tier.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class PetBasket {
    private LinkedList<Tier> petBasket = new LinkedList<Tier>();

    private final HashSet<String> petsInStore = new HashSet<>(Arrays.asList("hund", "fisch", "katze", "kuh", "hai"));

    public PetBasket() {
    }

    public LinkedList<Tier> getPetBasket() {
        return this.petBasket;
    }

    public HashSet<String> getPetsInStore() {
        return petsInStore;
    }

    public boolean addPetToBasket(String type, String name) {
        if (!isPetInStore(type)) {
            return false;
        }

        switch (type) {
            case ("hund"):
                petBasket.add(new Hund(name));
                break;

            case ("fisch"):
                petBasket.add(new Fisch(name));
                break;

            case ("hai"):
                petBasket.add(new Hai(name));
                break;

            case ("katze"):
                petBasket.add(new Katze(name));
                break;

            case ("kuh"):
                petBasket.add(new Kuh(name));
                break;
        }
        return true;
    }

    public boolean isPetInStore(String petType) {
        return petsInStore.contains(petType);
    }

    public void printAnimalsInStore() {
        petsInStore.forEach(animal -> System.out.print(animal + "; "));
    }
}
