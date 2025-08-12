package fundamentos.operadores.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Ask operators
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		double x = input.nextDouble();
		
		System.out.println("Input second number: ");
		double y = input.nextDouble();
		
		System.out.println("Input operator: ");
		String op = input.next();		
		
		// Logic
		double result = "+".equals(op) ? x + y : 0;
		result = "-".equals(op) ? x - y : result;
		result = "*".equals(op) ? x * y : result;
		result = "/".equals(op) ? x / y : result;
		result = "%".equals(op) ? x % y : result;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				x, op, y, result);
		
		input.close();
	}
}
