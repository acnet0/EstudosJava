package controle;

public class While {
	
	public static void main(String[] args) {
		//as tres partes essenciais de um codigo que diz respeito ao uso do while
		int contador = 1; // variavel
		
		while (contador <= 10) { // expressao
			System.out.printf("i = %d\n", contador); // %d visa substituir o número da variavel , contador
			contador++; // incremento
		}
	}
}
