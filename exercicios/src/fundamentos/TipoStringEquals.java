package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s); 
		// Despite the content of these strings being equal
		// it is still false because it's using a unary comparison
		System.out.println("2".equals(s));
		
		Scanner input = new Scanner(System.in);
		
		String s2 = input.nextLine();
		System.out.println(s2);
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		input.close();
	}
}
