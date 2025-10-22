package oo.composicao.desafio;

public class Produto {

	String nome;
	float preco;
	
	Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
		
	void setNome(String nome) {
		this.nome = nome;
	}
	String getNome() {
		return nome;
	}
	
	void setPreco(float preco) {
		this.preco = preco;
	}
}
