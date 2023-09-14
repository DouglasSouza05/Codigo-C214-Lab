package inatel;

import java.time.Duration;

// Duration duracao = Duration.ofMinutes(30); // Duração de 30 minutos

public class Filme {

    private int id;
    private String titulo;
    private int ano;
    private String genero;
    private Duration duracao;
    private boolean assistido = false;
    private float avaliacao = 0.0f;

    // Construtor com argumentos
    public Filme(int id, String titulo, int ano, String genero, long duracao) {

        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.duracao = Duration.ofMinutes(duracao);

    }

    // public void showDetails() {

    // System.out.println("Titulo: " + this.titulo);
    // System.out.println("Ano de Lançamento: " + this.ano);
    // System.out.println("Genêro: " + this.genero);
    // System.out.println("Duração: " + this.duracao);
    // System.out.println("Se foi Assistido: " + this.assistido);
    // System.out.println("Avaliação: " + this.avaliacao);
    // }

    public int getID() {
        return this.id;
    }

    // Getter e Setter para 'titulo'
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter e Setter para 'ano'
    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getter e Setter para 'genero'
    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter e Setter para 'duracao'
    public Duration getDuracao() {
        return this.duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    // Getter
    public boolean getState() {
        return this.assistido;
    }

    // Setter
    public void setState(boolean assistido) {
        this.assistido = assistido;
    }

    public float getRating() {
        return this.avaliacao;
    }

    public void setRating(float avaliacao) {
        this.avaliacao = avaliacao;
    }

}
