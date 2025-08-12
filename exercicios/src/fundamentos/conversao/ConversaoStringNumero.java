package fundamentos.conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String val1 = JOptionPane.showInputDialog(
				"Input the first value");
		String val2 = JOptionPane.showInputDialog(
				"Input the second value");
		
		System.out.println(val1 + val2);
		
		double num1 = Double.parseDouble(val1);
		double num2 = Double.parseDouble(val2);
		
		double sum  = num1 + num2;
		System.out.println("\nThe result is " + sum);
		System.out.println("The average is " + sum / 2);
		
		/* If we use this to add and average `7.9 + 8.3` the result is not going to be precise,
		this is due to a quirk in java and many other languages that stems from prioritizing
		speed over precision */
	}
}
