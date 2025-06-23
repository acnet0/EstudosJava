package aula2;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	
	void rabiscar () {
		if (this.tampada == true) {
			System.out.println("Não é possível rabiscar pois a caneta está tampada, destampe para poder rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
	}
	
	void escrever() {
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}
