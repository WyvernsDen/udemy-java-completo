package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println();
		System.out.println(3 > 4); // Asks if 3 is bigger than 4
		System.out.println(3 >= 3); // Asks if 3 is bigger than or equal to 3
		System.out.println(3 < 7); // Asks if 3 is smaller than 7
		System.out.println(30 <= 7); // Asks if 30 is smaller than or equal to 7
		System.out.println(30 != 7); // Asks if 30 does not equal 7
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("\nTem desconto? " + temDesconto);
	}
}
