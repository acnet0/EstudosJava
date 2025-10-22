package aula12;

public abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membros;
	
	public void locomover() {
		
	}
	public void alimentar() {
		
	}
	public void emitirSom() {
		
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public int getMembros() {
		return membros;
	}
	
	
}
