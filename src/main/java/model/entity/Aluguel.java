package model.entity;

import java.util.List;

public class Aluguel {
	private long id;
	private List<Livro> livros;
	private Usuario usuario;
	private String dataAluguel;
	
	public Aluguel() {};
	
	public Aluguel(List<Livro> livros, Usuario usuario, String dataAluguel) {
		super();
		this.livros = livros;
		this.usuario = usuario;
		this.dataAluguel = dataAluguel;
	}

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

	
	public String toString() {
		return "Aluguel [livros=" + livros + ", usuario=" + usuario + ", dataAluguel=" + dataAluguel + "]";
	}
}
