package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			System.out.println("Digite uma nota: ");
			
			double nota = entrada.nextDouble();
			
			if(nota > 10 || nota < 0) {
				System.out.println("Nota invalida, digie outro valor!");
			} else if (nota >= 8.1){
				System.out.println("Nota concito A");
			} else if (nota >= 6.1) {
				System.out.println("Nota conceito B");
			} else if (nota >= 4.1) {
				System.out.println("Nota conceito C");
			} else if (nota >= 2.1) {
				System.out.println("Nota conceido D");
			} else {
				System.out.println("Nota conceito E");
			}
			
		// Formas distinas com quais podemos escrever estruturas de controle IfElseIf
		//	if(nota > 10 || nota < 0) {
		//		System.out.println("Nota invalida, digie outro valor!");
		//	} else { 
				
		//		if (nota >= 8.1){
		//			System.out.println("Nota concito A");
		//		} else {
				
		//			if (nota >= 6.1) {
		//				System.out.println("Nota conceito B");
		//			} else { 
				
		//				if (nota >= 4.1) {
		//					System.out.println("Nota conceito C");
		//				} else {
							
		//					if (nota >= 2.1) {
		//						System.out.println("Nota conceido D");
		//					} else {
								
		//						System.out.println("Nota conceito E");
		//					}
		//				}	
		//			}		
		//		}	
		//	}
		entrada.close();
	}
}
