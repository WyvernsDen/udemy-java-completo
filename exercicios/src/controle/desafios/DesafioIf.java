package controle.desafios;

public class DesafioIf {

    public static void main(String[] args) {

        double grade = 9.0;
        boolean conditionQuadroDeHonra = grade >= 9.0;

        // não usar; em estrutures de controle (tem uma exceção)
        if (conditionQuadroDeHonra) {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }
    }
}
