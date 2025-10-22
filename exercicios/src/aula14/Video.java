package aula14;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;	
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getAvaliacao() {
		return this.avaliacao;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getViews() {
		return this.views;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public int getCurtidas() {
		return this.curtidas;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	public boolean getReproduzindo () {
		return this.reproduzindo;
	}
 	@Override
	public void play() {
		if (this.reproduzindo == false) {
			this.reproduzindo = true;
			System.out.println("Reproduzindo...");
		} else {
			System.out.println("Já está reproduzindo...");
		}
	}

	@Override
	public void pause() {
		if(this.reproduzindo == true) {
			this.reproduzindo = false;
			System.out.println("Pausando...");
		} else {
			System.out.println("Já está pausado...");
		}
	}

	@Override
	public void like() {
		this.curtidas++;
	}
	
	@Override
	public String toString() {
		return "Video{" + "titulo= " + titulo + ", avaliação=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
	}
	

	
	
	
}
