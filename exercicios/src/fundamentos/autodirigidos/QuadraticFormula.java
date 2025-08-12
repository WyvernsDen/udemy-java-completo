package fundamentos.autodirigidos;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input 'a': ");
		double a = input.nextDouble();
		System.out.println("Input 'b': ");
		double b = input.nextDouble();
		System.out.println("Input 'c': ");
		double c = input.nextDouble();
		double x;
		x = Math.sqrt((b*b));
		
		input.close();
		
	}
	
}
