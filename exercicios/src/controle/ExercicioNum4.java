package controle;

import java.util.Scanner;

public class ExercicioNum4 {
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite um número para verificar se é primo: ");
		int numero = entrada.nextInt();
		for (int i = 2; i < numero; i++); {
			int i = 2;
			if (numero % i  == 0) { 
					contadorDeDivisores++;
			}
		}
	
		if (contadorDeDivisores == 0) {
			System.out.println("Onumero" + numero + " é primo.");
		} else {
			System.out.println("O numero " + numero + " não é primo.");
		}
	
		entrada.close();
	}
}
