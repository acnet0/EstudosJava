package controle;

import java.util.Scanner;

public class DesafioDiaSemanaMes {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o dia: ");
		
		String dia = entrada.next();
		
		if (dia.equals("Domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("Segunda")) { //tambem pode ser escrito como: else if ("segunda".equalsIgnoreCase(dia)
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("Sábado")) {
			System.out.println("7");
		} else {
			System.out.println("Insira um dia válido.");
		}
		entrada.close();
	}
}
