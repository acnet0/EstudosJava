package aula09;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa (String nome, int idade, String sexo) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
	}
	public void fazerAniver() {
		int i = getIdade() + 1;
		this.setIdade(i);
		System.out.println("PARABÉNS!!" + nome);
		System.out.println("Pelo seu " + idade + "º aniversário!");
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int i) {
		this.idade = i;
	}
	public int getIdade() {
		return idade;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
	public String getSexo() {
		return sexo;
	}
}
