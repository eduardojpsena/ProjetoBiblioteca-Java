package model.service;
/**
 *
 * @author andreLuis
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.entity.Livro;
import model.entity.Usuario;

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
                    
                } else if (livros.get(i).getQuantidade() <= 1) {
                    JOptionPane.showConfirmDialog(null, "Livro " + livros.get(i).getTitulo() 
                    + " não pode ser alugado.");
                }
            } 
        }
    }

    //Listar os livros pertencentes a lista
    public List<Livro> listarLivro(){
        return livros;
    }

    //Gerar ficha catalografica
    public String fichaCatalografica(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                String [] autor = livro.getAutor().split(" ");
                return "••••••••••• FICHA CATALOGRÁFICA •••••••••••\n\n"
                + autor[1] + ", " + autor[0] + "\n\n    " + livro.getTitulo() 
                + "/" + livro.getAutor() + "-" + livro.getAno() + ".\n\n    1." 
                + livro.getTema();
            } 
        }
        return null;
    }

    //Exportar dados da lista de livros para um arquivo externo .txt
    public void exportarLivro(List<Livro> livros) throws IOException {
        File diretorio = new File("src/main/java/files");
        diretorio.mkdir();

        if (diretorio.isDirectory()) {
                FileWriter arquivo = new FileWriter("src/main/java/files/livros.txt", false);
                arquivo.write("ID,"+"TITULO,"+"AUTOR,"+"ANO,"+"QUANTIDADE,"+"TEMA\n");
                for (Livro livro : livros) {
                        arquivo.write(livro.getId() + "," + livro.getTitulo() + "," 
                                + livro.getAutor() + "," + livro.getAno() + "," 
                                + livro.getQuantidade() + "," + livro.getTema() + "\n");
                }
                arquivo.close();
        }
    }
    
    //Importar livros de um arquivo externo para a lista de livros
    public List<Livro> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        // Pualando a primeira linha do arquivo(Colunas)
        br.readLine();
        while (br.ready()) {
            String linha = br.readLine();
            //System.out.println(linha);
            String[] colunas = linha.split(",");
            cadastrarLivro(Long.parseLong(colunas[0]), colunas[1], colunas[2], colunas[3], 
                            Integer.parseInt(colunas[4]), colunas[5]);
        }

        br.close();
        return livros;
    }
    
    //Palavra com primeira letra em maiuscula
    public String nomeTitle(String palavra) {
        String [] partes = palavra.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for (String string : partes) {
            string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
            sb.append(string + " ");
        }
    	palavra = sb.toString();
    	return palavra.substring(0, palavra.length()-1);
    }

}
