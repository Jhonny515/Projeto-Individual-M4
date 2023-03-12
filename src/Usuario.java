public class Usuario {
    // Atributos
    private String nome_de_usuario;
    private Biblioteca biblioteca = new Biblioteca();
    private String id_de_acesso;

    // Construtor
    public Usuario(String nome_de_usuario,  String id_de_acesso) {
        this.nome_de_usuario = nome_de_usuario;
        this.id_de_acesso = id_de_acesso;
    }

    // Getters e Setters
    public String getNome_de_usuario() {
        return nome_de_usuario;
    }

    public void setNome_de_usuario(String nome_de_usuario) {
        this.nome_de_usuario = nome_de_usuario;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String getId_de_acesso() {
        return id_de_acesso;
    }

    public void setId_de_acesso(String id_de_acesso) {
        this.id_de_acesso = id_de_acesso;
    }


}

