package model;

public class MembroExterno {
    //Atributos
    private int id;
    private String nome;
    private String login;
    private String senha;
    private double taxaUsoSemestral;

    //Construtores
    public MembroExterno() {
    }

    public MembroExterno(int id, String nome, String login, String senha, double taxaUsoSemestral) {
            this.id = id;
            this.nome = nome;
            this.login = login;
            this.senha = senha;
            this.taxaUsoSemestral = taxaUsoSemestral;
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

    public double getTaxaUsoSemestral() {
            return taxaUsoSemestral;
    }

    public void setTaxaUsoSemestral(double taxaUsoSemestral) {
            this.taxaUsoSemestral = taxaUsoSemestral;
    }

    //toString
    public String toString() {
            return "MembroExterno [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha
                            + ", taxaUsoSemestral=" + taxaUsoSemestral + "]";
    }	
}