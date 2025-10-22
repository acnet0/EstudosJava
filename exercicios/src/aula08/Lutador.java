package aula08;
public final class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, derrota, empate;
    private float altura, peso;
    
    //Método Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    //Métodos Públicos
    
    public void apresentar() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("CHEGOU A GRANDE HORA! ESTES SÃO OS LUTADORES: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos" + this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empatou: " + this.getEmpate());
    }
    public void status() {
        System.out.println(this.getNome() + "é um peso " + this.getCategoria());
        System.out.println(this.getVitoria() + "= vitórias");
        System.out.println(this.getDerrota() + "= derrotas");
        System.out.println(this.getEmpate() + "= empates");
    }
    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
    //Métodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    private void setCategoria() {
        if (this.peso <52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public String getCategoria() {
        return categoria;
    }
    
    public int getVitoria() {
        return vitoria;
    }
    public void setVitoria(int vi) {
        this.vitoria = vi;
    }
    public int getEmpate() {
        return empate;
    }
    public void setEmpate(int em) {
        this.empate = em;
    }
    public int getDerrota() {
        return derrota;
    }
    public void setDerrota(int de) {
        this.derrota = de;
    }
}