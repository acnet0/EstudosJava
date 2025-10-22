package oo.polimorfismo;

public abstract class Comida { //Classes abstract não podem ser instanciadas.
	private double peso;
	
	Comida(double peso) {
		this.setPeso(peso);
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Double getPeso() {
		return peso;
	}
}
