package oo.composicao.desafio;
import java.util.ArrayList;

public class Compra {
	
	Cliente cliente;
	ArrayList<Item> item = new ArrayList<>();
	
	Compra(Cliente cliente) {
		
	}
	
	void adicionarCompra(Item item) {
		
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: item) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
