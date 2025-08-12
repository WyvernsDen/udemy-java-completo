package fundamentos.conversao;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // Implicit conversion
		System.out.println(a);
		
		float b = (float) 1.314314314314314;
		// Default solution for conversion in this case is to add an F at the end of the value
		// But we can cast through `(float)` as an explicit (lossy) conversion method
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // 127 is the max for byte, 128 rolls over into -128
		System.out.println(d);
		
		double e = 1.99999999999999;
		int f = (int) e; // Conversion lost all decimals
		System.out.println(f);
	}
}
