package aula12;

public class Reptil extends Animal{
	private String corEscama;
	
	public void locomover() {
		System.out.println("Rastejando");
	}
	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}
	public void emitirSom() {
		System.out.println("Som de Réptil");
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	public String getCorEscama() {
		return corEscama;
	}
}

