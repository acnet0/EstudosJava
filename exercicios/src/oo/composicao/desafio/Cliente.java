package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compra = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	String getNome() {
		return nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compra) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}