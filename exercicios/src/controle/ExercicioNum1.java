package controle;

import java.util.Scanner;

public class ExercicioNum1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um numero de 1 a 10: ");
		int num = entrada.nextInt();
		
		if (num <= 10 && num >= 0) {
			System.out.printf("O numero %d está entre 0 e 10.", num);
		} else {
			System.out.printf("O numero %d não está entre 0 e 10.", num);
		}
		System.out.println("");
		if (num % 2 == 0) {
			System.out.printf("O numero %d é par", num);
		} else {
			System.out.printf("O numero %d é impar.", num);
		}
		
		entrada.close();
	}
}
