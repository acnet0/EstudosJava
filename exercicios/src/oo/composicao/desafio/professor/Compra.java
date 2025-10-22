package oo.composicao.desafio.professor;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		this.itens.add(new Item(new Produto(nome, preco), qtde)); //instanciando e adicionando um item a uma compra que é um novo produto
	}
	
	double obterValorTotal() { // percorre todo item em itens atribuindo valor da relação entre qtd e produto
		double total = 0;
		
		for(Item item: itens) {	
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
