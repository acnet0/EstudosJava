package Fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // b = b - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); // Neste primeiro caso da verdadeiro devido a precedencia de ++a ser maior que b--...
		System.out.println(++a == b--); // Já neste momento como já foi efetuado o descremento o valor não é igual.
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
