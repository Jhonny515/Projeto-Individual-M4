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

    // main
    public static void main(String[] args) {
        System.out.println("I'm probably working..");
    }
}
