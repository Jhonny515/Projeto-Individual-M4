import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    private ArrayList<Midia> midias_do_usuario;
    private ArrayList<Playlist> playlists;

    // Construtora

    public Biblioteca() {
        this.midias_do_usuario = new ArrayList<Midia>();
        this.playlists = new ArrayList<Playlist>();
    }

    // Getters e Setters
    public int quantidade_midias() {
        return this.midias_do_usuario.size();
    }

    public Midia getMidia_do_usuario(int posicao) {
        return this.midias_do_usuario.get(posicao);
    }

    public void setMidia_do_usuario(Midia midia) {
        this.midias_do_usuario.add(midia);
    }

    public void deleteMidia_do_usuario(Midia midia) {
        this.midias_do_usuario.remove(midia);
    }

    public int quantidade_playlists() {
        return this.playlists.size();
    }

    public Playlist getPlaylists(int posicao) {
        return this.playlists.get(posicao);
    }

    public void setPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void deletePlaylist(Playlist playlist) {
        this.playlists.remove(playlist);
    }

    // Métodos
    public void tocar_playlist(Playlist playlist) {
        int tamanho_playlist = playlist.getTamanho_da_playlist();
        Midia[] midias = playlist.getMidias();
        int[] ordem_de_execucao = playlist.getOrdem_de_execucao();
        int midia_atual = playlist.getMidia_atual();

        for (int i = 0; i < tamanho_playlist; i++){
            Player.reproduzir(midias[midia_atual].getTitulo());
            midia_atual = ordem_de_execucao[i + 1];
        }

    }

    // main
    public static void main(String[] args) {
        System.out.println("TODA MÍDIA EM TODO LUGAR AO MESMO TEMPO");
        System.out.println("Iniciando biblioteca do usuário...");

        // Criando Artistas
        System.out.println("Checando artistas");

        // Atores e Atrizes
        Ator act1 = new Ator("Carey Becsteer","25/10/2000",new String[1],"Masculino",null);
        // premiações do act1
        act1.setPremiacoes("Paper Globe");

        Ator act2 = new Ator("Raven Becsteer","10/12/1985",new String[2],"Feminino","Academy of Art University");
        // premiações do act1
        act2.setPremiacoes("Nideonckelo Kids' Choice Award: Atriz de TV Favorita");
        act2.setPremiacoes("TV La: Impactei");

        Ator act3 = new Ator("Chelsea Danieles","11/09/1985",null,"Feminino","Academy of Art University");

        // Músicistas
        Musico musicista1 = new Musico("Cleidisvaldo","25/04/1989",null,"Masculino","Violonista");

        Musico musicista2 = new Musico("Arianna Pequena","29/09/1992",new String[3],"Não Binário","Vocalista");
        // premiações de musici2
        musicista2.setPremiacoes("Vocalista do Ano 2021");
        musicista2.setPremiacoes("Vocalista do Ano 2022");
        musicista2.setPremiacoes("Grammy");

        Musico musicista3 = new Musico("Dennis","25/08/1959",null,"Masculino","Baixista");

        System.out.println("Lista de artistas atualizada!");

        // Criando mídias
        System.out.println("Checando mídias");

        Filme filme1 = new Filme("Varredores",
                2015,"Musical",
                "1:15",
                "Longa",
                new Ator[3],
                "Raven Becsteer",
                "Chelsea Danieles");
        filme1.getElenco()[0] = act1;
        filme1.getElenco()[1] = act2;
        filme1.getElenco()[2] = act3;

        Musica musica1 = new Musica("Obrigada, anterior",2007,"Pop","3:57",musicista2,new Musico[1],4.8);
        musica1.getArtistas_participantes()[0] = musicista1;

        Musica musica2 = new Musica("Ageó da Viola",2002, "Instrumental", "4:15", musicista1, null, 4.5);

        Musica musica3 = new Musica("Violando Tocão",2003,"Instrumental","3:37", musicista1,new Musico[3],4.3);
        musica3.setArtistas_participantes(musicista1);
        musica3.setArtistas_participantes(musicista2);
        musica3.setArtistas_participantes(musicista3);

        Midia mid1 = filme1;
        Midia mid2 = musica1;
        Midia mid3 = musica2;

        System.out.println("Mídias atualizadas!");

        // Criando usuário
        Usuario user1 = new Usuario("Jhonny","user1");

        // Acessando Biblioteca do usuário
        System.out.println("Checando usuário..");

        Biblioteca user1_biblioteca = user1.getBiblioteca();

        // Criando Playlist
        System.out.println("Checando playlists..");

        Playlist user1_playlist1 = new Playlist("Música");
        user1_playlist1.setMidias(mid2);
        user1_playlist1.setMidias(mid3);

        user1_biblioteca.setPlaylist(user1_playlist1);

        System.out.println("Playlist atualizadas!");

        // Tocando playlist
        System.out.println("Executando playlist do usuário.");

        user1_biblioteca.tocar_playlist(user1_biblioteca.getPlaylists(0));

        // Finalizando aplicação
        System.out.println("Estamos sempre aqui. Estamos sempre em todo lugar.");

    }
}
