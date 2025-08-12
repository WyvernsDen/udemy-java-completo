package fundamentos.operadores.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (T or F)
		// Trabalho na quinta (T or F)
		
		/*
		If both trabalhos derem certo você vai comprar uma TV de 50 polegadas no fim de semana
		If one dos trabalhos derem certo, você vai comprar uma TV de 32 polegadas
		If either dos trabalhos derem certo, a familia vai tomar sorvete
		If none dos trabalhos derem certo, não vão tomar sorvete ou comprar TV
		 */
		
		boolean tt = true;
		boolean tq = false;
		boolean tv50 = tt && tq;
		boolean tv32 = tt ^ tq;
		boolean shopping = tt || tq;
		boolean sorvete = shopping;
		boolean saudavel = !sorvete;
		
		System.out.println("Completou o trabalho terça? " + tt);
		System.out.println("Completou o trabalho quinta? " + tq);
		System.out.println("Comprou TV 50\"? " + tv50);
		System.out.println("Comprou TV 32\"? " + tv32);
		System.out.println("Foi ao shopping? " + shopping);
		System.out.println("Tomou sorvete? " + sorvete);
		System.out.println("É saudavel? " + saudavel);
	}
}
