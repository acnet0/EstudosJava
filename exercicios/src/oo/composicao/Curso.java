package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	// No caso o final em List diz respeito a impossibilidade de criar uma NOVA lista, e não de alterar os itens
	// que estão contidos nela, podemos manipular eles livremente, pois mesmo que retiremos todos os itens 
	// seu endereço de memoria não altera.
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionaraluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	
	public String toString() {
		return nome;
	}
}
