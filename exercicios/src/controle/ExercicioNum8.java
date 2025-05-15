package controle;

import java.util.Scanner;

public class ExercicioNum8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("Insira o %dº número: ", contador );
			System.out.print("");
			int num = entrada.nextInt();
			if (maior <= num) {
				maior = num;
			}
		}
		System.out.printf("O maior número foi %d", maior);
		entrada.close();
	}
}
