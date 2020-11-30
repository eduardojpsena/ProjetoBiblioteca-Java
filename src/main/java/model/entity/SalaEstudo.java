package model.entity;
/**
 *
 * @author eduardoSena
 */

public class SalaEstudo {
    //Atributos
    private long id;
    private String nome;
    private boolean status;

    //Construtores
    public SalaEstudo() {}

    public SalaEstudo(long id, String nome, boolean status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
    }
    
    //Get e Set
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    //toString
    public String toString() {
        return "SalaEstudo{" + "id=" + id + ", nome=" + nome + ", status=" + status + '}';
    }
}
