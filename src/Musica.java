public class Musica extends Midia {
    // Atributos
    Musico artista_principal;
    Musico[] artistas_participantes;
    double nota;

    // Constructor
    public Musica(String titulo, int ano, String genero, String duracao, Musico artista_principal, Musico[] artistas_participantes, double nota) {
        super(titulo, ano, genero, duracao);
        this.artista_principal = artista_principal;
        this.artistas_participantes = artistas_participantes;
        this.nota = nota;
    }

    // Getters e Setters
    public Musico getArtista() {
        return this.artista_principal;
    }

    public void setArtista(Musico artista) {
        this.artista_principal = artista;
    }

    public Musico[] getArtistas_participantes() {
        return this.artistas_participantes;
    }

    public void setArtistas_participantes(Musico[] artistas_participantes) {
        this.artistas_participantes = artistas_participantes;
    }

    public double getNotas() {
        return this.nota;
    }

    public void setNotas(double notas) {
        this.nota = notas;
    }
}
