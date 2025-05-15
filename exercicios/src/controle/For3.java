package controle;

public class For3 {
	public static void main(String[] args) {
		
		// for(int i = 0; i < 10; i++) {
		//	System.out.println(1);
		//}
		//Dess forma retorna mensagem de erro pois a variavel
		//i esta no escopo do 1 for, e nao no geral, para acessar
		//ela novamente precisamos alterar o escopo da variavel
		//System.out.println(i);
		//rever aula para atalhos ao debugar codigo
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 ; j++) {
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		
	}
}
