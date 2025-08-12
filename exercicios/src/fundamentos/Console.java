package fundamentos;

import java.util.Scanner;

public class Console {

		public static void main(String[] args) {
			
			System.out.print("Good");
			System.out.print(" morning!\n\n");
			
			System.out.println("Good");
			System.out.println("morning!");
			
			System.out.printf("\nPowerball numbers: %d %d %d %d %d %d", 
					1, 2, 3, 4, 5, 6);
			System.out.printf("\nSalary: %.1f%n", 1234.5678);
			System.out.printf("\nName: %s%n", "João");
			
			Scanner input = new Scanner(System.in); // Start scanner process named "input"
			
			System.out.print("Input your name: ");
			String name = input.nextLine();
			
			System.out.print("Input your surname: ");
			String surname = input.nextLine();
			
			System.out.print("Input your age: ");
			int age = input.nextInt();
			
			System.out.print("Input your phone number: ");
			long phone = input.nextLong();
			input.nextLine();
			
			System.out.printf("%s %s is %d years old, their phone number is +55%d",
					name, surname, age, phone);
			
			input.close(); // Close process or it will keep running indefinitely
		}
}
