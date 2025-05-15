package Fundamentos.operadores;

public class Ternario { //ternario pois compreende 3 operadores, a expressao e caso seja true e caso seja false
	public static void main(String[] args) {
		double media = 86;
		String resultadoFinal = media >= 7.0 ?
				"aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ?
				"Sim." : "Não.";
		// Forma acima como podemos utilizar um ternario para devolver um valor booleano de true e false como sim e não para o usuário.
		System.out.printf("Tem desconto? %s", resultado);
		
	}
}
