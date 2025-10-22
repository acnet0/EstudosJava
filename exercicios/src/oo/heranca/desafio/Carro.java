package oo.heranca.desafio;

public class Carro {
		
		public final int VELOCIDADE_MAXIMA;
		protected int velAtual;
		private int delta = 5;
		
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
		
	public void acelerar() {
		if(velAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += getDelta();
		}
	}
	
	public void frear() {
		if(this.velAtual >= 5) {
			this.velAtual -= 5;	
			System.out.println("Carro está freando");
		} else {
			System.out.println("Carro está parado.");
		}
		
	}
	
	public String toString() {
		return "Velocidade atual é " + velAtual + "Km/h";
	}
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
}
