package oo.composicao.desafio.professor;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal(); //com este metodo puxamos o metodo obter de compra, e este por sua vez o calcula para todas as compras dentro da lista do cliente.
		}
		
		return total;
	}
	
	void adicionarCompra(Compra compra) { //passo como parametro a lista de compra, e em sequencia adiciono tal lista a lita da cliente
		this.compras.add(compra);
	}
	
}
