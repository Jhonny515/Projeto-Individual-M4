public class Playlist {
    // Atributos
    String tipo_de_midia;
    Midia midias[];

    // Constructor
    public Playlist(String tipo_de_midia, Midia[] midias) {
        this.tipo_de_midia = tipo_de_midia;
        this.midias = midias;
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

        public void setMidias(Midia[] midias) {
            this.midias = midias;
        }

}
