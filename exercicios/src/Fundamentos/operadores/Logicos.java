package Fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
			
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("Tabela verdadedo E/&&: ");
		System.out.println( true && true);
		System.out.println( true && false);
		// System.out.println( false && true);
		// System.out.println( false && false);
		
		System.out.println("Tabela verdade do OU/||: ");
		// System.out.println( true || true);
		// System.out.println( true || false);
		System.out.println( false || true);
		System.out.println( false || false);
		
		System.out.println("Tabela verdade do XOR/^: ");
		System.out.println( true ^ true);
		System.out.println( true ^ false);
		System.out.println( false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela verdade do Falso/!:");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
