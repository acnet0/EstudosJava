package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals { // ao comparar igualdade entre os conteudos das strings utilizar o metodo .equals() ao inves do ==
	
	public static void main(String[] args) {
	
		System.out.println("2" == "2");
		// Neste caso o resultado sera true devido a "2" ser igual a "2"m, sao numeros inteiros sem estar alocados numa variavel
		String s1 = new String("2"); // Criamos s1 contendo a string "2"
		System.out.println("2" == s1); // Comparamos a string "2" com a variavel s1 que mesmo tendo como conteudo a string "2", o resultaod sera diferente pois os tipos influenciam, não apenas o conteudo
		System.out.println("2".equals(s1)); // neste caso com o .equals ele compara justamennte o conteúdo das variáveis.
		
		Scanner entrada = new Scanner(System.in); // mecanismo para lermos infomaçaes dos usuarios
		
		String s2 = entrada.nextLine(); // com a funcao next line ele (AO CONTRARIO DE LINE) não reita os " " deixados propostalmente
		// String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim()); //trim tambem tem essa mesma função de remover os " "
		System.out.println("2".equals(s2.trim())); // neste caso estamos comparando com o .equals os conteúdos (e seus espaços digitados retirados conforme .trim)
		
		entrada.close();
		
	}
}
