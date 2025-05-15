package controle;

import java.util.Scanner;

public class ExercicioNum6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("JOGO DE ADIVINHAÇÃO");
		int numero = 55;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Tentativa de número: %d", i);
			System.out.println("");
			System.out.print("Insira um número: ");
			int tentativa = entrada.nextInt();
			if (tentativa == numero){
				System.out.println("Parabéns, adivinhou o número.");
				i += 10;
			} else if (tentativa > numero) {
				System.out.println("Tente novamente com um número menor.");
			} else if (tentativa < numero) {
				System.out.println("Tente novamente com um número maior.");
			}
		}
		entrada.close();
	}
}
