package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { // funcoes lambdas sao quando atribuimos uma funcao diretamente na variavel, sao funcoes anonimas por assim dizer, sem classe definida
			return x + y; // neste exemplo estamos utilizando a Interface Calculo e seu metodo como parametro.
		};
		
		System.out.println(calc.executar(2, 3));
		
//FUNCOES LAMBDAS
		
		calc = (x, y) -> x * y;// ao omitirmos o corpo da funcao, estamos de forma implicita informando que retornaremos numa unica sentenca de codigo dentro da funcao na qual sera retronado
		
		System.out.println(calc.executar(2, 3));
	}
}
