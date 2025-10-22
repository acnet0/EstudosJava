package aula09;

import java.util.Random;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public Livro(String titulo, String autor, int totPaginas) {
		setTitulo(titulo);
		setAutor(autor);
		setTotPaginas(totPaginas);
		
	}

	public String detalhes() {
		return ("Livro ( " + "\n, Título: " + titulo + "\n, Autor: " + autor 
				+ "\n, Páginas: " + totPaginas + "\n, Página Atual: " + pagAtual 
				+ "\n, Livro está aberto?: " + aberto + "\n, Leitor: " + leitor.getNome()
				+ "\n, idade: " + leitor.getIdade() + "\n, sexo: " + leitor.getSexo());
	}
	
/*	
	public void detalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Páginas: " + totPaginas);
		System.out.println("Página Atual: " + pagAtual);
		System.out.println("Livro está aberto?: " + aberto);
		System.out.println("Leitor: " + leitor);
	} */
	public void setTitulo(String tit) {
		this.titulo = tit;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor(String aut) {
		this.autor = aut;
	}
	public String getAutor() {
		return autor;
	}
	public void setTotPaginas(int totp) {
		this.totPaginas = totp;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setPagAtual(int pat) {
		this.pagAtual = pat;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setAberto(boolean ab) {
		this.aberto = ab;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setLeitor(Pessoa lei) {
		this.leitor = lei;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	@Override
	public void abrir() {
		if(this.getAberto() == false) {
			this.setAberto(true);
			System.out.println("Abrindo o livro");
		} else {
			System.out.println("Livro já está aberto");
		}
		System.out.println("Livro está aberto?: " + getAberto());
	}
	@Override
	public void fechar() {
		if(this.getAberto() == true) {
			this.setAberto(false);
			System.out.println("Fechando o livro");
		} else {
			System.out.println("Livro já esá fechado");
		}
		System.out.println("Livro está aberto?: " + getAberto());
	}
	@Override
	public void folhear() {
		Random aleatorio = new Random();
		int totp = getTotPaginas();
		int folheando = aleatorio.nextInt(totp);
		this.setPagAtual(folheando);
		System.out.println("Folheando o livro... Página atual:  " + this.getPagAtual());
	}
	@Override
	public void avancarPag() {
		this.pagAtual++;
		
		
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}
}
