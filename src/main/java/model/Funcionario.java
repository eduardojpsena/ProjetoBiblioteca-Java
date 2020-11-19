package model;

public class Funcionario {
    //Atributos
    private int id;
    private String nome;
    private String login;
    private String senha;
    private Evento evento;
    private FichaCatalografica fichaCat;

    //Construtores
    public Funcionario() {
    }
    public Funcionario(int id, String nome, String login, String senha, Evento evento, FichaCatalografica fichaCat) {
            this.id = id;
            this.nome = nome;
            this.login = login;
            this.senha = senha;
            this.evento = evento;
            this.fichaCat = fichaCat;
    }

    //Get e Set
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public String getLogin() {
            return login;
    }
    public void setLogin(String login) {
            this.login = login;
    }
    public String getSenha() {
            return senha;
    }
    public void setSenha(String senha) {
            this.senha = senha;
    }
    public Evento getEvento() {
            return evento;
    }
    public void setEvento(Evento evento) {
            this.evento = evento;
    }
    public FichaCatalografica getFichaCat() {
            return fichaCat;
    }
    public void setFichaCat(FichaCatalografica fichaCat) {
            this.fichaCat = fichaCat;
    }

    //toString
    public String toString() {
            return "Funcionario [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", evento="
                            + evento + ", fichaCat=" + fichaCat + "]";
    }
	
}