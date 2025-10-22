package aula09;

public class Aula09 {
	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[2];
		
		p[0] = new Pessoa("Antonio", 26, "Masculino");
		p[1] = new Pessoa("Carlos", 64, "Masculino");
		
		Livro l[] = new Livro[3];

		l[0] = new Livro("Fundacao", "Asimov", 240);
		l[1] = new Livro("Senhor dos Aneis", "Tolkien", 600);
		l[2] = new Livro("Castelvania", "Xefe", 100);
		
		l[0].setPagAtual(90);
	
		l[0].avancarPag();
		
		System.out.println("Voltei uma página... Página atual: " + l[1].getPagAtual());
		
		System.out.println (l[0].getPagAtual());
	}
}
