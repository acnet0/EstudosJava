package controle;

public class ContinueRotulado {
	public static void main(String[] agrs) {
		
		externo:for (int i = 0; 1 < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if( i == 1) {
					continue externo; // continue rotulado neste caso interrompe a interação selecionada, seguindo para a próxima.
				}			
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		
		//System.out.println("Fim!");
	}
}
