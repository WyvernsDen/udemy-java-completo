package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		
		double avg = 8.6;
		String finalResult = avg >= 7.0 ? 
				"aprovado." : "em recuperação."; 
		// `? "if true" : "if false"`
		System.out.println("O aluno está " + finalResult);
		
		avg = 7.3;
		boolean posBehavior = true;
		boolean passingAvg = avg >= 7;
		boolean discount = posBehavior && passingAvg;
		String result = discount ? "Sim." : "Não.";
		System.out.printf("\nTem desconto? %s", result);
	}
}
