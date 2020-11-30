package model.entity;
/**
 *
 * @author andreLuis
 */

import java.util.ArrayList;

public class Usuario {
    //Atributos
    private long id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
     
    //Construtores
    public Usuario() {}

    public Usuario(long id, String nome, String login, String senha, String tipo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    //Get e Set
    public long getId() {
        return id;
   }
   public void setId(long id) {
        this.id = id;
   }

   public String getLogin() {
        return login;
   }
   public void setLogin(String login) {
        this.login = login;
   }

   public String getNome() {
        return nome;
    }
   public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   //toString
   public String toString() {
           return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha 
                   + ", tipo=" + tipo + "]";
   }
}
	
	 
