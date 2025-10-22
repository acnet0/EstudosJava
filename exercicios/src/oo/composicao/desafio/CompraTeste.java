////
//
//1 Cliente pode ter nome e uma lista de compras
// Cliente deve ter metodo de obter metodo valor total no qual percorrerra as compras e os itens e retornara o valor total gasto
//Compra tera lista de itens
//item tera atributo de quantidade e de produto
//produto tera o preco e o nome

package oo.composicao.desafio;

public class CompraTeste {
	
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente("Fabio");
		Compra compra1 = new Compra(cliente1);

		cliente1.compra.add(compra1);
		
		Produto vectra = new Produto("Vectra", 100.000f);
		Produto honda = new Produto("Honda", 15.000f);
		
		compra1.item.add(new Item(vectra, 1));
		compra1.item.add(new Item(honda, 1));
		
		System.out.println(cliente1.compra.size());
		System.out.println(compra1.item.size());
		
		System.out.println(cliente1.obterValorTotal());

		
		
		
	}
}