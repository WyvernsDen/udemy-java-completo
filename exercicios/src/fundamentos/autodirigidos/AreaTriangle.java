package fundamentos.autodirigidos;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the length of the base of the triangle in centimeters: ");
		double b = input.nextDouble();
		System.out.println("Input the height of the triangle in centimeters: ");
		double h = input.nextDouble();
		
		double result = (b*h)/2;
		
		System.out.printf("The area of a triangle with a base of %.0fcm and a height of %.0fcm is %.2fcm²",
				b, h, result);
		
		input.close();
		
	}
}
