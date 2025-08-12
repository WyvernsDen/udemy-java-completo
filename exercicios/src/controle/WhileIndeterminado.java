package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type `exit` to exit: ");

        String exit = "";
        boolean exitbool = false;

        while (!exitbool) {
            exitbool = exit.equalsIgnoreCase("exit");
            exit = input.nextLine();
            System.out.print("Type `exit` to exit: ");
        }

//        while (!exitbool) {
//            exit = input.nextLine();
//            exitbool = "exit".equalsIgnoreCase(exit.trim());
//            if(!exitbool){
//                System.out.print("Type `exit` to exit: ");
//            }
//        }

        input.close();

    }
}
