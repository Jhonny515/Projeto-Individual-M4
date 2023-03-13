public class Musico extends Artista{
    // Atributos
    private String ocupacao;

    // Constructor
    public Musico(String nome, String data_de_nascimento, String[] premiacoes, String genero, String ocupacao) {
        super(nome, data_de_nascimento, premiacoes, genero);
        this.ocupacao = ocupacao;
    }

    // Getters e Setters
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
