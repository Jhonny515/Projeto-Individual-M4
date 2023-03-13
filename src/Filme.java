public class Filme extends Midia {
    // Atributos
    private String tipo;
    private Ator[] elenco;
    private String diretor;
    private String produtor;

    // Constructor

    public Filme(String titulo, int ano, String genero, String duracao, String tipo, Ator[] elenco, String diretor, String produtor) {
        super(titulo, ano, genero, duracao);
        this.tipo = tipo;
        this.setElenco(elenco);
        this.setDiretor(diretor);
        this.setProdutor(produtor);
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ator[] getElenco() {
        return elenco;
    }

    public void setElenco(Ator[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
}
