package Fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2+3);
		
		var x = 34.56; //naturalmente identifica que é double por ter .
		double y = 2.2; //declaramos ser double de antemão
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // divisao de numeros inteiros o resultado sera inteiro
		System.out.println(a / (double) b ); //neste caso podemos converter para double, retornando double e não mais int.
		System.out.println(a / (float) b );
		
		System.out.println(8 % 3); // resto da divisao com numeros inteiros
		System.out.println(a % b); // resto da divisao utilizando as variaveis

		System.out.println(x + y - a * b); //como utilizamos variaveis x e y sendo double, e a variavel a e b inteiro, por envolverem posteriormente uma operação, o retorno sera double.

	
	}
	
}
