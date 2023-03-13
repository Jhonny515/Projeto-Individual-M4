public class Musica extends Midia {
    // Atributos
    private Musico artista_principal;
    private Musico[] artistas_participantes;
    private double nota;

    // Constructor
    public Musica(String titulo, int ano, String genero, String duracao, Musico artista_principal, Musico[] artistas_participantes, double nota) {
        super(titulo, ano, genero, duracao);
        this.setArtista_principal(artista_principal);
        this.setArtistas_participantes(artistas_participantes);
        this.setNota(nota);
    }

    // Getters e Setters
    public Musico getArtista() {
        return this.getArtista_principal();
    }

    public void setArtista(Musico artista) {
        this.setArtista_principal(artista);
    }

    public Musico[] getArtistas_participantes() {
        return this.artistas_participantes;
    }

    public void setArtistas_participantes(Musico artista_participante) {
        for(int i = 0; i < this.getArtistas_participantes().length; i++) {
            if (this.getArtistas_participantes()[i] == null) {
                this.getArtistas_participantes()[i] = artista_participante;
                return;
            }
        }
    }

    public double getNotas() {
        return this.getNota();
    }

    public void setNotas(double notas) {
        this.setNota(notas);
    }

    public Musico getArtista_principal() {
        return artista_principal;
    }

    public void setArtista_principal(Musico artista_principal) {
        this.artista_principal = artista_principal;
    }

    public void setArtistas_participantes(Musico[] artistas_participantes) {
        this.artistas_participantes = artistas_participantes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
