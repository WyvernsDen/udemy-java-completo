package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12.57;
		System.out.println(a);
		
		// can't `a = "...";`
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Text";
		System.out.println(c);
		
		c = "Text2";
		System.out.println(c);
		
		// can't `c = 4.5;`
		
		double d; // declared
		d = 123.65; // initialized
		System.out.println(d); // used
		
		var e = 123.45;
		System.out.println(e);
		
		var f  = 12; // integer
		// can't `f = 12.01;`
		System.out.println(f);		
		
	}
}
