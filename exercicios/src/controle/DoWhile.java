package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // if(...) block; or {}
        // while(...) block; or {}
        // for(...; ...; ...;) block; or {}

        // do {} while(...);
        Scanner input = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("You need to say " +
                    "the magic words...");
            System.out.print("Would you like to leave? ");
            text = input.nextLine();
        } while(!text.equalsIgnoreCase("yes please"));

        System.out.println("Thank you!");
        input.close();
    }
}
