package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4256.89);

		
		var p2 = new Produto(); //nesse caso o tipo é identificado através da inferencia e utiliza o construtor padrao (sem parametros)
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + "" + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
//		System.out.println(); System -> classe | out -> atributo | println-> comportamento|
	}
}
