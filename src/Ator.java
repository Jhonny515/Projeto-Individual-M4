public class Ator extends Artista {
    // Atributos
    private String formacao;

    // Constructor

    public Ator(String nome, String data_de_nascimento, String[] premiacoes, String genero, String formacao) {
        super(nome, data_de_nascimento, premiacoes, genero);
        this.formacao = formacao;
    }

    // Getters and Setters
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
