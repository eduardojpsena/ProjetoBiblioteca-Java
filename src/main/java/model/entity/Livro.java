package model.entity;
/**
 *
 * @author andreLuis
 */

public class Livro {
    //Atributos
    private long id;
    private String titulo;
    private String autor;
    private String ano;
    private int quantidade;
    private String tema;

    //Construtores
    public Livro() {};

    public Livro(long id, String titulo, String autor, String ano, int quantidade, String tema) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
        this.tema = tema;
    }

    //Get e Set
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public String toString() {
        return "Livro ID: " + id + "\nTITULO: " + titulo +"\nAUTOR: "+ autor
                + "\nANO: " + ano + "\nTEMA: " + tema + "\nQUANTIDADE: " + quantidade;
    }
}
