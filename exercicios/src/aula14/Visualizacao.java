package aula14;

public class Visualizacao {

	private Garfanhoto espectador;
    private Video filme;

    public Visualizacao(Garfanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public void avaliar(){

    }
    public void avaliar(String nota) {

    }
    public void avaliar(int porc) {

    }
    public void setEspectador(Garfanhoto espectador){
        this.espectador = espectador;
    }
    public Garfanhoto getEspectador() {
        return espectador;
    }
   public void setFilme(Video filme) {
        this.filme = filme;
    }
    public Video getFilme() {
        return filme;
    }
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
}