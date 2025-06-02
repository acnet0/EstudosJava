package desafio;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		System.out.println("Quantas notas quer informar?");
		Scanner entrada = new Scanner(System.in);
		int i = entrada.nextInt();
		double [] notas = new double [i];
		for(int c = 0; c < i; c++) {
			System.out.println("Insira a " + c  + "nota.");
			double entradaNota = entrada.nextDouble();
			if(entradaNota <= 10.0 ) {
				notas [c] = entradaNota;
			} else {
				System.out.println("Escreva uma nota válida.");
			}
		}
		double media = 0;
		for(int c = 0; c < notas.length; c++) {
			media =+ notas [c] + media;
		}
		media = media/i;
		System.out.println("A media da turma foi de" + media);
		entrada.close();
	}
}
