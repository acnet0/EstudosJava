package controle;

public class Continue {

		public static void main(String[] args) {
			
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 1) {
					continue; // continue interrompe a interação atual, mas resguarda o laço completo
				}             // codigo complexo para falar numeros pares
				
				System.out.println(i);
			}
			
			for (int i = 0; i <= 10; i++) {
				if (i == 5) continue;
				System.out.println(i);
			}
		}
}
