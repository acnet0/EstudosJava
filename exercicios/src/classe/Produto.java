package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;

	}
	
	Produto (){
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}	
	double precoComDesconto(double descontoDoGerente) {
			return preco * (1 - (desconto + descontoDoGerente));
	}
}
		//como os dados estao proximos do comportamente, nao e necessario nenhum dado adicional para termos o desconto
		//Neste caso podemos ter 2 metodos com o mesmo nome dentro de uma mesma classe, não é um prooblema
		//Desde que sua Assinatura seja diferente, ou seja, nao possuir o mesmo parametro