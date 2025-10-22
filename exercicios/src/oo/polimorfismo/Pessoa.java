package oo.polimorfismo;

public class Pessoa {
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	public void setPeso(double novoPeso) {
		this.peso = novoPeso;
	}
	public double getPeso() {
		return peso;
	}
	public void comer (Comida comida) {
		this.peso += comida.getPeso();
	}
}
