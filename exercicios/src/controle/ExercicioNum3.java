package controle;

import java.util.Scanner;

public class ExercicioNum3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota de 1 a 10: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Insira a segunda nota de 1 a 10: ");
		double nota2 = entrada.nextDouble();
		
		double media = ((nota1 + nota2) /2);

		if (media >= 7.0) {
			System.out.printf("Aluno Aprovado, com media de " + media);
		} else if ((media <= 7.0) && (media >= 4.0)) {
			System.out.printf("Aluno em Recuperação, com media de " + media);
		} else
			System.out.printf("Aluno Reprovado, com media de " + media);
		
		entrada.close();
	}
}
