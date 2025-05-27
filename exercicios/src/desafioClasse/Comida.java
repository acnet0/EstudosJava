package desafioClasse;

public class Comida {
	String nome;
	double peso;
	
	Comida(String nomeComida, double pesoComida){
		this.nome = nomeComida;
		this.peso = pesoComida;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
}
