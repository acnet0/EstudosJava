package aula11;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void RenovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	public void PagarMensalidade() {
		System.out.println(this.nome + " é bolsista, pagamento facilitado");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
