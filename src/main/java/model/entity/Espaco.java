package model.entity;
/**
 *
 * @author eduardoSena
 */

public class Espaco {
    //Atributos
    private long id;
    private String nomeLocal;
    private int capacidade;

    //Construtores
    public Espaco() {}

    public Espaco(long id, String nomeLocal, int capacidade) {
        this.id = id;
        this.nomeLocal = nomeLocal;
        this.capacidade = capacidade;
    }

    //Get e Set
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }
    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        return "Espaco [id=" + id + ", nomeLocal=" + nomeLocal + ", capacidade=" 
                + capacidade + "]";
    }
}
