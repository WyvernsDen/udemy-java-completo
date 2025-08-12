package fundamentos.conversao.desafios;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;
//import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Locale brazil = Locale.forLanguageTag("pt-BR");
		NumberFormat inputFormat = NumberFormat.getNumberInstance(brazil);
		NumberFormat outputFormat = NumberFormat.getCurrencyInstance(brazil);
		
		try {
			String val1 = JOptionPane.showInputDialog("Informe o primeiro salário: ");
			String val2 = JOptionPane.showInputDialog("Informe o segundo salário: ");
			String val3 = JOptionPane.showInputDialog("Informe o terceiro salário: ");
	
			double pay1 = inputFormat.parse(val1).doubleValue();
			double pay2 = inputFormat.parse(val2).doubleValue();
			double pay3 = inputFormat.parse(val3).doubleValue();
			
			double avg = (pay1 + pay2 + pay3) / 3;
			String avgF = outputFormat.format(avg);
			
			System.out.println("A média dos salários é " + avgF);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,
					"Erro, use o formato correto",
					"Erro de formato",
					JOptionPane.ERROR_MESSAGE);
		}
		/* Answer using scanner:
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String val1 = input.next().replace(",", ".");
		System.out.println("Informe o segundo salário: ");
		String val2 = input.next().replace(",", ".");
		System.out.println("Informe o terceiro salário: ");
		String val3 = input.next().replace(",", ".");
		
		double pay1 = Double.parseDouble(val1);
		double pay2 = Double.parseDouble(val2);
		double pay3 = Double.parseDouble(val3);
		
		double avg = (pay1 + pay2 + pay3) / 3;
		System.out.println("A média dos salários é " + avg);
		
		input.close();
		*/
	}
}
