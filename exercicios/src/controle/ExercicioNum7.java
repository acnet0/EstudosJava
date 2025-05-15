package controle;

import java.util.Scanner;

public class ExercicioNum7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num0 = 0;
		int soma = 0;
		while (num0 >= 0) {
			System.out.print("Insira um número:");
			int num = entrada.nextInt();
			num0 = num;
			if (num >=0) {
				soma = soma + num;
			System.out.printf("Valor total: %d",soma);
			System.out.println("");
			}
			}
		System.out.println("Fim do programa.");
		System.out.printf("O Valor total foi de : %d", soma);
		entrada.close();
	}
}
