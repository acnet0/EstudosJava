package aula10;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public Funcionario(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setSetor(setor);
		this.setTrabalhando(trabalhando);
	}
	public void mudarTrabalho(String cargoNovo) {
		this.setor = cargoNovo;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getSetor() {
		return setor;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	public boolean getTrabalhando() {
		return trabalhando;
	}
}
