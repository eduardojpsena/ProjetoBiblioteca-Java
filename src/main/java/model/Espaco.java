package model;

public class Espaco {
    //Atributos
    private int id;
    private String nome;
    private Double capacidade;

    //Constutores
    public Espaco() {
    }

    public Espaco(int id, String nome, Double capacidade) {
            this.id = id;
            this.nome = nome;
            this.capacidade = capacidade;
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
    
    public Double getCapacidade() {
            return capacidade;
    }
    public void setNome(Double capacidade) {
            this.capacidade = capacidade;
    }

    //toString
    public String toString() {
            return "Espaco [id=" + id + ", nome=" + nome + ", capacidade=" + capacidade + "]";
    }
}