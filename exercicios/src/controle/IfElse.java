package controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog(
                "Informe o número: ");
        int num = Integer.parseInt(value);

//        if(num % 2 == 0) {
//            System.out.println("Número par!");
//        }
//
//        if(num % 2 == 1) {
//            System.out.println("Número impar!");
//        }

        if(num % 2 == 0)
            System.out.println("Número par!");
         else
            System.out.println("Número ímpar!");

    }
}
