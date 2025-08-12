package fundamentos.operadores.desafios;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		/*
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c + "\n\n");
		*/
		
		// Could've typed everything as double
		int x1 = 6 * (3 + 2);
		int x2 = 3 * 2;
		int x3 = (int) Math.pow(x1, 2); 
		// Could've put x1 directly into Math.pow without defining it by using Math.pow(6 * (3 + 2), 2);
		int x4 = (x3 / x2);
		
		int y1 = (1 - 5) * (2 - 7);
		int y2 = 2;
		int y3 = (y1 / y2);
		int y4 = (int) Math.pow(y3, 2);
		// Could've calculated y3 directly inside Math.pow by using Math.pow(y1 / y2, 2);
		
		int z1 = 10;
		int z2 = (int) Math.pow(z1, 3);
		// Could've put 10 directly into Math.pow
		
		int xy = x4 - y4;
		int xy2 = (int) Math.pow(xy, 3);
		
		int result = xy2 / z2;
		
		System.out.println("\n6 times (3 + 2) to the power of 2 is equal to " + x1);
		System.out.println(x1 + " to the power of 2 is equal to " + x3);
		System.out.println(x3 + " divided by " + x2 + " is equal to " + x4);
		System.out.println("\n(1 - 5) times (2 - 7) is equal to " + y1);
		System.out.println(y1 + " divided by " + y2 + " is equal to " + y3);
		System.out.println(y3 + " to the power of 2 is equal to " + y4);
		System.out.println("\n" + z1 + " to the power of 3 is equal to " + z2);
		System.out.println("\n" + x4 + " minus " + y4 + " is equal to " + xy);
		System.out.println(xy + " to the power of 3 is equal to " + xy2);
		System.out.println(xy2 + " divided by " + z2 + " is equal to " + result);
		System.out.println("\nThe result is " + result);
		
		/*
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		 */
	}
}
