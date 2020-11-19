package model;

public class Aluno {
    //Atributos
    private int id;
    private String nome;
    private String login;
    private String senha;

    //Construtores
    public Aluno() {};

    public Aluno(int id, String nome, String login, String senha) {
            this.id = id;
            this.nome = nome;
            this.login = login;
            this.senha = senha;
    }

    //GET e SET
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

    //toString
    public String toString() {
            return "Aluno [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
    }
}