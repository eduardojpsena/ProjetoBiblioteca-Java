package model.entity;
/**
 *
 * @author andreLuis
 */

import java.util.List;

public class Aluguel {
    //Atributos
    private long id;
    private List<Livro> livros;
    private Usuario usuario;
    private String dataAluguel;
    
    //Construtores
    public Aluguel() {};

    public Aluguel(List<Livro> livros, Usuario usuario, String dataAluguel) {
        this.livros = livros;
        this.usuario = usuario;
        this.dataAluguel = dataAluguel;
    }

    //Get e Set
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataAluguel() {
        return dataAluguel;
    }
    public void setDataAluguel(String dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    //toString
    public String toString() {
        return "Aluguel [livros=" + livros + ", usuario=" + usuario 
                + ", dataAluguel=" + dataAluguel + "]";
    }
}
