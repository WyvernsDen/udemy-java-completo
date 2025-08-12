package fundamentos.autodirigidos;

import java.util.Scanner;

public class TempConversionFC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the temperature in Fahrenheit: ");
		double f = input.nextDouble();
		double result = ((f - 32)*5)/9;
		
		System.out.printf("%.1f°F in Celsius is %.1f°C", f, result);
		input.close();
	}
}
