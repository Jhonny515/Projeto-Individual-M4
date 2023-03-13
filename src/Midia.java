public class Midia {
    // Atributos
    private String titulo;
    private int ano;
    private String genero;
    private String duracao;

    // Constructor

    public Midia(String titulo, int ano, String genero, String duracao) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setGenero(genero);
        this.setDuracao(duracao);
    }

    // Getters e Setters
    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
