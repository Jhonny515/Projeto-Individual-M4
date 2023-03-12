public class Playlist {
    // Atributos
    private String tipo_de_midia;
    private Midia midias[];
    private int tamanho_da_playlist;

    // Constructor
    public Playlist(String tipo_de_midia) {
        this.tipo_de_midia = tipo_de_midia;
        this.midias = new Midia[500];
        this.tamanho_da_playlist = 0;
    }

    // Getters and Setters
    public String getTipo_de_midia() {
        return tipo_de_midia;
    }

    public void setTipo_de_midia(String tipo_de_midia) {
        this.tipo_de_midia = tipo_de_midia;
    }

    public Midia[] getMidias() {
        return midias;
    }

    public void setMidias(Midia midia) {
        this.midias[this.tamanho_da_playlist] = midia;
        this.tamanho_da_playlist++;
    }

    public int getTamanho_da_playlist() {
        return tamanho_da_playlist;
    }
}
