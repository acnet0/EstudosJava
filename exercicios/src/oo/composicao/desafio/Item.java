package oo.composicao.desafio;

public class Item {
	
	int quantidade;
	Produto produto;
	
	Item( Produto produto, int quantidade){
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	int getQuantidade() {
		return quantidade;
	}
	
}
