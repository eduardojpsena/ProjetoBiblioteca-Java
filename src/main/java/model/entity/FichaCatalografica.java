package model.entity;

/**
 *
 * @author eduardoSena
 */
public class FichaCatalografica {
    //Atributos
    private long id;
    private String titulo;
    private String autor;
    private String ano;
    private int qtdPaginas;
    private String isbn;
    private String palavraChave;

    //Construtores
    public FichaCatalografica() {}

    public FichaCatalografica(long id, String titulo, String autor, String ano, int qtdPaginas, 
            String isbn, String palavraChave) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.qtdPaginas = qtdPaginas;
        this.isbn = isbn;
        this.palavraChave = palavraChave;
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

    public int getQtdPaginas() {
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getPalavraChave() {
        return palavraChave;
    }
    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    //toString
    public String toString() {
        return "FichaCatalografica: ID=" + id + ", Titulo=" + titulo + ", Autor=" + autor 
                + ", Ano=" + ano + ", QtdPaginas=" + qtdPaginas + ". ISBN: " + isbn 
                + "PalavraChave=" + palavraChave + '}';
    }
}
