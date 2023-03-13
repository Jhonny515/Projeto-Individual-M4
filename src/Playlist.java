public class Playlist {
    // Atributos
    private String tipo_de_midia;
    private Midia midias[];
    private int[] ordem_de_execucao;
    private int midia_atual;
    private int tamanho_da_playlist;

    // Constructor
    public Playlist(String tipo_de_midia) {
        this.tipo_de_midia = tipo_de_midia;
        this.midias = new Midia[500];
        this.ordem_de_execucao = new int[500];
        this.midia_atual = this.ordem_de_execucao[0];
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

    public int[] getOrdem_de_execucao() {
        return ordem_de_execucao;
    }

    public void setOrdem_de_execucao(int[] ordem_de_execucao) {
        this.ordem_de_execucao = ordem_de_execucao;
    }

    public int getMidia_atual() {
        return midia_atual;
    }

    public void setMidia_atual(int midia_atual) {
        this.midia_atual = midia_atual;
    }

    // Métodos
    public void midia_anterior() {}
    public void proxima_midia() {}
    public void misturar_midias() {}
}
