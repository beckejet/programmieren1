package Tier.petshop;

import java.util.Scanner;

public class PetShopInput {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String description) {
        System.out.println(description);
        return scanner.nextLine().toLowerCase();
    }

    public boolean getAnswer(String description) {
        System.out.println(description + " [ja/nein]");
        String input = scanner.nextLine();
        if (input.equals("ja")) {
            return true;
        } else if (input.equals("nein")) {
            return false;
        }
        throw new IllegalArgumentException("Invalid input");
    }
}
