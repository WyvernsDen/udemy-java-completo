package fundamentos.autodirigidos;

import java.util.Scanner;

public class TempConversionCF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the temperature in Celsius: ");
		double f = input.nextDouble();
		double result = ((f*9)/5)+32;
		
		System.out.printf("%.1f°C in Fahrenheit is %.1f°F", f, result);
		
		input.close();
	}
}
