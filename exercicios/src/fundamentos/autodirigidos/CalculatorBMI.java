package fundamentos.autodirigidos;

import java.util.Scanner;

public class CalculatorBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your weight in kilograms: ");
		double w = input.nextDouble();
		System.out.println("Input your height in centimeters: ");
		double h = input.nextDouble();
		h = (h/100);
		h *= h;
//		System.out.println(h);
		double bmi = w/h;
		System.out.printf("Your BMI is: %.1f", bmi);
		
		input.close();
	}
}
