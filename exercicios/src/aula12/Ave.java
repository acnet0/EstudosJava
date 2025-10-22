package aula12;

public class Ave extends Animal{
	private String corPena;
	
	public void locomover() {
		System.out.println("Voando");
	}
	public void alimentar() {
		System.out.println("Comendo Frutas");
	}
	public void emitirSom() {
		System.out.println("Som de Ave");
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	public String getCorPena() {
		return this.corPena;
	}
}
