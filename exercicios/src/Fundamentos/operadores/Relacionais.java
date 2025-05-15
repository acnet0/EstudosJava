package Fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 56;
		
		System.out.println(a == b); // igual
		System.out.println(a != b); // diferente
		System.out.println(a > b);  // maior 
		System.out.println(a >= b); // maior igual
		System.out.println(a < b); // menor
		System.out.println(a <= b); // menor igual
		
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
			
	}
}
