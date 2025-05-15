package controle;

import java.util.Scanner;

public class ExercicioNum2 {

	public static void main(String[] args) {
		
		System.out.print("Insira um ano:");
		Scanner entrada = new Scanner(System.in);
		
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		entrada.close();
	}
}
