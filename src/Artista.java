public class Artista {
    // Atributos
    String nome;
    String data_de_nascimento;
    String[] premiacoes;
    String genero;

    // Construtora
    public Artista(String nome, String data_de_nascimento, String[] premiacoes, String genero) {
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String[] getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String[] premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
