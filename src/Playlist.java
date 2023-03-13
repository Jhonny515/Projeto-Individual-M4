import java.util.Random;

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
    public String midia_anterior() {
        String nome_midia_anterior = null;
        for (int i = 0; i < this.tamanho_da_playlist; i++) {
            if (this.midia_atual == this.ordem_de_execucao[i]) {
                nome_midia_anterior = this.midias[this.midia_atual - 1].getTitulo();
            }
        }
        return nome_midia_anterior;
    }
    public String proxima_midia() {
        String nome_proxima_midia = null;
        for (int i = 0; i < this.tamanho_da_playlist; i++) {
            if (this.midia_atual == this.ordem_de_execucao[i]) {
                nome_proxima_midia = this.midias[this.midia_atual - 1].getTitulo();
            }
        }
        return nome_proxima_midia;
    }
    public void misturar_midias() {
        Random embaralhar = new Random(); // Classe com método que retorna número aleatório
        int tamanho_da_playlist = this.tamanho_da_playlist;

        for (int i=0; i < tamanho_da_playlist; i++) {

            // pega número aleatório, conforme o tamanho da playlist e salva
            int rand = embaralhar.nextInt(tamanho_da_playlist);

            // Embaralha a ordem de execução, invertendo o valor atual com o valor do randômico
            int valor_inicial = this.ordem_de_execucao[i];
            this.ordem_de_execucao[i] = this.ordem_de_execucao[rand];
            this.ordem_de_execucao[rand] = valor_inicial;
        }
    }
}
