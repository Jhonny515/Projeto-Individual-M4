public class Artista {
    // Atributos
    private String nome;
    private String data_de_nascimento;
    private String[] premiacoes;
    private String genero;

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

    public void setPremiacoes(String premiacoes) {
        int tamanho_premiacoes = this.premiacoes.length;
        int i = 0;
        while (this.premiacoes[i] != null) {
            i++;
        }
        this.premiacoes[i] = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
