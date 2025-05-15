package controle;

public class BreakRotulado {
	
	public static void main(String[] agrs) {
		
		externo: for (int i = 0; 1 < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if( i == 1) {
					break externo; // com o rotulo podemos exolher qul laço queremos interromper
				}			
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
