package classe;

public class PrimeiroTeste {
	
	int a = 3;
	static int b = 4; // caso transformemos como static, podemos acessar esta variavel de instancia sem necessariamente instanciar a classe na qual ela pertence.
	public static void main (String[] args) { 
		
		PrimeiroTeste p = new PrimeiroTeste(); //so conseguimos acessar o valor de a por ser uma instancia da classe Primeiro Teste
		System.out.println(p.a);               // dessa forma apos instanciar primeiro teste com o new PrimeiroTeste, conseguimos acessar normalmnte. 
		
		System.out.println(b);
	}
}
