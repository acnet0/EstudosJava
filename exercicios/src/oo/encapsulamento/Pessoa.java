package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String novoSobrenome) {
		this.sobrenome = novoSobrenome;
	}
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome(); 
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	public String toString() {
		return "Olá meu nome é " + getNome() + " e meu sobrenome é " + getSobrenome() + " tenho " + getIdade() + " anos";
	}
}
