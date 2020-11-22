package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Livro;
import model.Usuario;

public class LivroService {
	List<Livro> livros = new ArrayList<Livro>(); 
	
	//Cadastrar livros e adicionar a lista livros
	public Livro cadastrarLivro(long id, String titulo, String autor, String ano, int quantidade, String tema){
		Livro livro = new Livro(id, titulo, autor, ano, quantidade, tema);
		livros.add(livro);
		
		return livro;
	}
	
	//Remover livro da lista de livros
	public void removerLivro(String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getTitulo().equals(titulo)) {
				livros.remove(i);
			}
		}
	}
	
	//Realizar aluguel de livros
	public void alugarLivro(String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getTitulo().equals(titulo)) {
				if (livros.get(i).getQuantidade() > 1) {
					livros.get(i).setQuantidade(livros.get(i).getQuantidade()-1);
					JOptionPane.showConfirmDialog(null, "Livro " + livros.get(i).getTitulo() 
							+ " alugado com sucesso. \nQuantidade restante: " + livros.get(i).getQuantidade());
					
				} else if (livros.get(i).getQuantidade() <= 1) {
					JOptionPane.showConfirmDialog(null, "Livro " + livros.get(i).getTitulo() 
							+ " n�o pode ser alugado. \nQuantidade restante: " + livros.get(i).getQuantidade());
				}
			} 
		}
	}
	
	//Listar os livros pertencentes a lista
	public List<Livro> listarLivro(){
		return livros;
	}
	
	//Gerar ficha catalografica
	public Livro fichaCatalografica(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}
	
	//Importar livros de um arquivo externo para a lista de livros
	public List<Livro> importarArquivo(String nomeArquivo) throws IOException {
		File arquivo = new File(nomeArquivo);
		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		// Pualando a primeira linha do arquivo(Colunas)
		br.readLine();
		while (br.ready()) {
			String linha = br.readLine();
			System.out.println(linha);
			String[] colunas = linha.split(",");
			cadastrarLivro(Long.parseLong(colunas[0]), colunas[1], colunas[2], colunas[3], 
					Integer.parseInt(colunas[4]), colunas[5]);
		}
		
		br.close();
		return livros;
	}
	
}