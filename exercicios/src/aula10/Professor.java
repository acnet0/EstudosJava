package aula10;

public class Professor extends Pessoa{
	
	private String especialidade;
	private float salario;
	
	public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
		super(nome, idade, sexo);
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setEspecialidade(especialidade);
		this.setSalario(salario);
	}
	public void ReceberAum(int aum) {
		this.salario += aum;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
