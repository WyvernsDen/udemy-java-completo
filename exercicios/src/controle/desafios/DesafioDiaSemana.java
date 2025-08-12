package controle.desafios;

import javax.swing.*;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        String weekday = JOptionPane.showInputDialog(
                "Informe o dia da semana: ");

//        boolean sunday = (weekday.equals("Domingo")) || (weekday.equals("domingo"));
//        boolean monday = (weekday.equals("Segunda")) || (weekday.equals("segunda"));
//        boolean tuesday = (weekday.equals("Terça")) || (weekday.equals("terça"));
//        boolean wednesday = (weekday.equals("Quarta")) || (weekday.equals("quarta"));
//        boolean thursday = (weekday.equals("Quinta")) || (weekday.equals("quinta"));
//        boolean friday = (weekday.equals("Sexta")) || (weekday.equals("sexta"));
//        boolean saturday = (weekday.equals("Sábado")) || (weekday.equals("sábado"));

        boolean sunday = (weekday.equalsIgnoreCase("domingo"));
        boolean monday = (weekday.equalsIgnoreCase("segunda"))
            || (weekday.equalsIgnoreCase("segunda feira"))
            || (weekday.equalsIgnoreCase("segunda-feira"));
        boolean tuesday = (weekday.equalsIgnoreCase("terça"))
            || (weekday.equalsIgnoreCase("terça feira"))
            || (weekday.equalsIgnoreCase("terça-feira"))
            || (weekday.equalsIgnoreCase("terca feira"))
            || (weekday.equalsIgnoreCase("terca-feira"));
        boolean wednesday = (weekday.equalsIgnoreCase("quarta"))
            || (weekday.equalsIgnoreCase("quarta feira"))
            || (weekday.equalsIgnoreCase("quarta-feira"));
        boolean thursday = (weekday.equalsIgnoreCase("quinta"))
            || (weekday.equalsIgnoreCase("quinta feira"))
            || (weekday.equalsIgnoreCase("quinta-feira"));
        boolean friday = (weekday.equalsIgnoreCase("sexta"))
            || (weekday.equalsIgnoreCase("sexta feira"))
            || (weekday.equalsIgnoreCase("sexta-feira"));
        boolean saturday = (weekday.equalsIgnoreCase("sábado"))
            || (weekday.equalsIgnoreCase("sabado"));

        if (sunday)
            JOptionPane.showMessageDialog(null, "1");
            else if (monday)
                JOptionPane.showMessageDialog(null, "2");
            else if (tuesday)
                JOptionPane.showMessageDialog(null, "3");
            else if (wednesday)
                JOptionPane.showMessageDialog(null, "4");
            else if (thursday)
                JOptionPane.showMessageDialog(null, "5");
            else if (friday)
                JOptionPane.showMessageDialog(null, "6");
            else if (saturday)
                JOptionPane.showMessageDialog(null, "7");
            else
                JOptionPane.showMessageDialog(null,"Dia inválido!");
    }
}
