package model;

public class Evento {
    //Atributos
    private int id;
    private String nome;
    private Espaco espaco;
    private String data;

    //Construtores
    public Evento() {
    }

    public Evento(int id, String nome, Espaco espaco, String data) {
            this.id = id;
            this.nome = nome;
            this.espaco = espaco;
            this.data = data;
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

    public Espaco getEspaco() {
            return espaco;
    }
    public void setEspaco(Espaco espaco) {
            this.espaco = espaco;
    }

    public String getData() {
            return data;
    }
    public void setData(String data) {
            this.data = data;
    }

    //toString
    public String toString() {
            return "Evento [id=" + id + ", nome=" + nome + ", espaco=" + espaco + ", data=" + data + "]";
    }
}