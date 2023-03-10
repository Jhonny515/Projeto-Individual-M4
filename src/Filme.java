public class Filme extends Midia {
    // Atributos
    String tipo;
    Ator[] elenco;
    String diretor;
    String produtor;

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
