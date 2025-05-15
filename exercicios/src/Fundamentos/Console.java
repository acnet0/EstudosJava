package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
	
			Scanner entrada = new Scanner(System.in);
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Telefone: ");
			int telefone = entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Descrição: ");
			String resumo = entrada.nextLine();
			
			
			System.out.printf("%s %d %s", nome, telefone, resumo);
			
			entrada.close();
	}
}
