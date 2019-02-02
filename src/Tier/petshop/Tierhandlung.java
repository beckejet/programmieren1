package Tier.petshop;

import Tier.Tier;

public class Tierhandlung {
    private State state = State.START;
    private PetBasket currentBasket = new PetBasket();
    private PetShopInput petShopInput = new PetShopInput();

    enum State {
        START,
        CHOOSE_ANIMAL,
        ASK_TO_PROCEED,
        PRICE_OF_BASKET,
        SAY_GOODBYE,
        ERROR_STATE
    }

    public  void startPetShop() {
        while (true) {
            switch (state) {
                case START:
                    System.out.println("Guten Morgen!!");
                    state = State.CHOOSE_ANIMAL;
                    break;
                case CHOOSE_ANIMAL:
                    state = chooseAnimal() ? State.ASK_TO_PROCEED : State.CHOOSE_ANIMAL;
                    break;

                case ASK_TO_PROCEED:
                    state = petShopInput.getAnswer("Wollen weiter einkaufen ?") ?
                            State.CHOOSE_ANIMAL
                            : State.PRICE_OF_BASKET;
                    break;
                case PRICE_OF_BASKET:
                    state = State.SAY_GOODBYE;
                    break;
                case SAY_GOODBYE:
                    currentBasket.getPetBasket().forEach(Tier::sprechen);
                    return;

                case ERROR_STATE:
                default:
                    System.out.println("ERROR STATE!!!");
                    return;
            }
        }
    }

    private boolean chooseAnimal() {
        String type = petShopInput.getInput("Welches Tier Wollen sie kaufen ? ");
        if (!currentBasket.isPetInStore(type)) {
            System.out.println("Entschuldigung diese Tier haben wir nicht im Angebot bittw wählen sie zwischen folgenden aus:");
            currentBasket.printAnimalsInStore();
            System.out.println();
            return false;
        }
        String name = petShopInput.getInput("Wie soll es denn heiße??");
        return currentBasket.addPetToBasket(type, name);
    }
}
