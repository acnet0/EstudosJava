package controle;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		int contador = 0;
		
		while(!valor.equalsIgnoreCase("sair")) { // ! como NEGAÇÃO!!!!!! da proposicao, logo ENQUANTO NAO FOR DIGITADO SAIR, FAÇA
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
			contador++;
		}
		
		System.out.println("Acabou finalmente, você inseriu " + contador + " palavras.");
		
		entrada.close();
	}
}
