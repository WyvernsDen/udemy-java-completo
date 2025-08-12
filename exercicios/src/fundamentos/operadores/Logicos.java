package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condition1 = true;
		boolean condition2 = 3 > 7;
		
		System.out.println(condition1 && condition2); 
		// Logical and (&&) returns true if both are true, false if one or none are true
		
		System.out.println(condition1 || condition2); 
		// Logical or (||) returns true if any are true, false if none are true
		
		System.out.println(condition1 ^ condition2); 
		// XOR (^) returns true if they are different, false if they are the same
		
		System.out.println(!condition2);
		// Logical not (!) returns true if false, false if true
		
		System.out.println(condition1 && !condition2); 
		// Because ! reverses the false statement, when && is asked it's returned as true
		
		System.out.println(!!condition1); 
		// Because ! reverses the previous !, the statement is returned to it's default state of true
		
		System.out.println("\nTable for AND (&&)");
		System.out.println(true && true); // True because both are true
		System.out.println(true && false); // False because one is false
//		System.out.println(false && true); // False because one is false
//		System.out.println(false && false); // False because both are false
		// Code is dead because the first false makes the statement false regardless of the second bit
		
		System.out.println("\nTable for OR (||)");
//		System.out.println(true || true);  // True because both are true
//		System.out.println(true || false); // True because one is true
		// Code is dead because the first true makes the statement true regardless of the second bit
		System.out.println(false || true); // True because one is true
		System.out.println(false || false); // False because none are true
		
		System.out.println("\nTable for XOR (^)");
		System.out.println(true ^ true); // False because they are not different
		System.out.println(true ^ false); // True because they are different
		System.out.println(false ^ true); // True because they are different
		System.out.println(false ^ false); // False because they are not different
	}
}
