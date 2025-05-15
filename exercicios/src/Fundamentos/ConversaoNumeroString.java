package Fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
			Integer num1 = 10000; // declarando um wrapper de um int na variavel num1
			System.out.println(num1.toString().length()); // esta colocando para num1 retornar como string, e dessa forma receber a funcao .length
			
			int num2 = 100000; // a outra forma de fazer, declarando inicialmente a variavel como tipo primitivo
			System.out.println(Integer.toString(num2).length()); // encapsulando a variavel num2, e recebendo a funcao .length
			
			
			//System.out.println(("5" + num1)); // dessa forma sendo compreendida como string, o + faz com que se adicione o espaço e nao como operação matematica
			System.out.println(("" + num1).length());
			System.out.println(("" + num2).length());
	}
}
