import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    String usuario;
    Midia[] midias_do_usuario;
    Playlist[] playlists;

    // Construtora

    public Biblioteca(String usuario, Midia[] midias_do_usuario, Playlist[] playlists) {
        this.usuario = usuario;
        this.midias_do_usuario = midias_do_usuario;
        this.playlists = playlists;
    }

    // Getters e Setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Midia[] getMidias_do_usuario() {
        return midias_do_usuario;
    }

    public void setMidias_do_usuario(Midia[] midias_do_usuario) {
        this.midias_do_usuario = midias_do_usuario;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
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
        for (int i = 0; i < playlist.midias.length; i++) {
            if (playlist.midias[i] != null) {
                Player.reproduzir(playlist.midias[i].titulo);
            }
        }
    }

    // main
    public static void main(String[] args) {
        System.out.println("TODAS MÍDIA EM TODO LUGAR AO MESMO TEMPO");
        System.out.println("Iniciando biblioteca do usuário...");

        // Criando Artistas
        System.out.println("Checando artistas");

        // Atores e Atrizes
        Ator act1 = new Ator("Corey Baxter","25/10/2000",new String[1],"Masculino",null);
        // premiações do act1
        act1.premiacoes[0] = "Paper Globe";

        Ator act2 = new Ator("Raven Simonee","10/12/1985",new String[2],"Feminino","Academy of Art University");
        // premiações do act1
        act2.premiacoes[0] = "Nickelodeon Kids' Choice Award: Atriz de TV Favorita";
        act2.premiacoes[1] = "TV Land: Impact";

        Ator act3 = new Ator("Chelsea Daniels","11/09/1985",null,"Feminino","Academy of Art University");

        // Músicistas
        Musico musicista1 = new Musico("Cleidisvaldo","25/04/1989",null,"Masculino","Violonista");

        Musico musicista2 = new Musico("Ariana","29/09/1992",new String[3],"Não Binário","Vocalista");
        // premiações de musici2
        musicista2.premiacoes[0] = "Vocalista do Ano 2021";
        musicista2.premiacoes[1] = "Vocalista do Ano 2022";
        musicista2.premiacoes[2] = "Grammy";

        System.out.println("Lista de artistas atualizada!");

        // Criando mídias
        System.out.println("Checando mídias");

        Filme filme1 = new Filme("Varredores",
                2015,"Musical",
                "1:15",
                "Longa",
                new Ator[3],
                "Raven Baxter",
                "Chelsea Daniels");
        filme1.elenco[0] = act1;
        filme1.elenco[1] = act2;
        filme1.elenco[2] = act3;

        Musica musica1 = new Musica("Obrigada, anterior",2007,"Pop","3:57",musicista2,new Musico[1],4.8);
        musica1.artistas_participantes[0] = musicista1;

        Musica musica2 = new Musica("Ageó da Viola",2002, "Instrumental", "4:15", musicista1, null, 4.5);

        Midia mid1 = filme1;
        Midia mid2 = musica1;
        Midia mid3 = musica2;

        System.out.println("Mídias atualizadas!");

        // Criando usuário
        Usuario user1 = new Usuario("Jhonny","user1");

        // Acessando Biblioteca do usuário
        System.out.println("Checando usuário..");

        Biblioteca user1 = new Biblioteca("Usuário 1",null, new Playlist[1]);
        // Criando Playlist
        System.out.println("Checando playlists..");

        Playlist user1_playlist1 = new Playlist("Música",new Midia[2]);
        user1_playlist1.midias[0] = mid2;
        user1_playlist1.midias[1] = mid3;

        user1.playlists[0] = user1_playlist1;

        System.out.println("Playlist atualizadas!");

        // Tocando playlist
        System.out.println("Executando playlist do usuário.");

        user1.tocar_playlist(user1.playlists[0]);

        // Finalizando aplicação
        System.out.println("Estamos sempre aqui. Estamos sempre em todo lugar.");

    }
}
