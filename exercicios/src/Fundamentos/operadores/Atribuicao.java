package Fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
	
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b Atribuição aditiva
		c -= a; // c = c - a Atribuição subtrativa
		c *= b; // c = c * b Atribuição multiplicativa
		c /= a; // c = c / a Atribuição divisiva
		
		System.out.println(c);
		
		c %= 2; // c = c % 2 Atribuição Modular // retorna apenas 0 ou 1, sendo otimo para definir se um numero é par ou impar.
		
		System.out.print(c);
		
	}
}
