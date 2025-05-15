package controle;

import java.util.Scanner;

public class ExercicioNum5 {
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero para veificar se ele é primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		
		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;
			
			default:
				System.out.println("O numero "+ numero + " não é um numero primo.");
			
		}
	
		
		
		entrada.close();
	}
}
