package fundamentos.autodirigidos;

import java.util.Scanner;

public class SquaredCubed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a value: ");
		double x = input.nextDouble();
		double square = x*x;
		double cube = x*x*x;
		
		System.out.printf("%.0f^2 is equal to %.0f", x, square);
		System.out.printf("\n%.0f^3 is equal to %.0f", x, cube);
		
		input.close();
	}
}
