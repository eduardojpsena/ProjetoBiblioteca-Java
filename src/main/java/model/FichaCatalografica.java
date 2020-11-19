package model;

public class FichaCatalografica {
    //Atributos
    private int id;
    private String titulo;
    private String autor;
    private String categoria;

    //Construtores
    public FichaCatalografica() {
    }

    public FichaCatalografica(int id, String titulo, String autor, String categoria) {
            this.id = id;
            this.titulo = titulo;
            this.autor = autor;
            this.categoria = categoria;
    }

    //Get e Set
    public int getId() {
            return id;
    }
    public void setId(int id) {
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

    public String getCategoria() {
            return categoria;
    }
    public void setCategoria(String categoria) {
            this.categoria = categoria;
    }

    //toString
    public String toString() {
            return "FichaCatalografica [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria
                            + "]";
    }
}