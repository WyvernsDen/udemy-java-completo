package fundamentos.conversao;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); 
		// You can use the type instead of the name of an object for conversions
		// You just need to specify the object within the conversion itself
		
		// You can also convert an integer to string using `System.out.println("" + OBJECTNAME)`
		// But that's not really used
	}
}
