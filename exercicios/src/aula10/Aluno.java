package aula10;

public class Aluno extends Pessoa{
	private int matr;
	private String curso;
	
	public Aluno(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setMatr(matr);
		this.setCurso(curso);
	}
	public void cancelarMatr() {
		this.matr = 0;
	}
	public int getMatr() {
		return matr;
	}
	public void setMatr(int matr) {
		this.matr = matr;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
