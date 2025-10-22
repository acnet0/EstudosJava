package aula14;

public class Garfanhoto extends Pessoa{
	private String login;
	private int totAssistido;

	public void viuMaisUm() {
	
	}
	
	public Garfanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogin() {
		return this.login;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	public int getTotAssistido() {
		return this.totAssistido;
	}
	@Override
	public String toString() {
		return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", login=" + login + '}';
	}
}
