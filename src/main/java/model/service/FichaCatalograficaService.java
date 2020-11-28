package model.service;
/**
 *
 * @author eduardoSena
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.entity.FichaCatalografica;

public class FichaCatalograficaService {
    List<FichaCatalografica> fichas = new ArrayList<FichaCatalografica>();
    
    //Cadastra ficha catalografica e adiciona a lista de fichas
    public FichaCatalografica cadastrarFicha(long id, String titulo, String autor, 
            String ano, int qtdPaginas, String isbn,  String palavraChave){
        FichaCatalografica fichaCat = new FichaCatalografica(id, titulo, autor, 
                ano, qtdPaginas, isbn, palavraChave);
        fichas.add(fichaCat);
        
        return fichaCat;
    }
    
    //Listar fichas catalográficas pertencentes a lista de fichas
    public List<FichaCatalografica> listarFichas(){
        return fichas;
    }
    
    //Exportar dados da lista de fichas catalograficas para um arquivo externo .txt
    public void exportarFichas(List<FichaCatalografica> fichas) throws IOException {
        File diretorio = new File("src/main/java/files");
        diretorio.mkdir();

        if (diretorio.isDirectory()) {
            FileWriter arquivo = new FileWriter("src/main/java/files/fichasCat.txt", false);
            arquivo.write("ID,"+"TITULO,"+"AUTOR,"+"ANO,"+"PAGINAS,"+"ISBN,"+"PALAVRA-CHAVE\n");
            for (FichaCatalografica ficha : fichas) {
                    arquivo.write(ficha.getId() + "," + ficha.getTitulo() + "," + ficha.getAutor() 
                            + "," + ficha.getAno() + "," + ficha.getQtdPaginas() + "," 
                            + ficha.getIsbn() + "," + ficha.getPalavraChave() + "\n");
            }
            arquivo.close();
        }
    }
    
    //Importar fichas catalograficas de um arquivo externo para a lista de fichas
    public List<FichaCatalografica> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        // Pualando a primeira linha do arquivo(Colunas)
        br.readLine();
        while (br.ready()) {
            String linha = br.readLine();
            System.out.println(linha);
            String[] colunas = linha.split(",");
            cadastrarFicha(Long.parseLong(colunas[0]), colunas[1], colunas[2], colunas[3], 
                            Integer.parseInt(colunas[4]), colunas[5], colunas[6]);
        }

        br.close();
        return fichas;
    }
       
    //Gerar ficha catalografica
    public String VisualizarFichaCatalografica(String titulo) {
        for (FichaCatalografica ficha : fichas) {
            String [] autor = ficha.getAutor().split(" ");
            return "•••••••••••••••••••• FICHA CATALOGRÁFICA ••••••••••••••••••••\n\n"
                    + autor[1] + ", " + autor[0] + "\n\n    " + 
                    ficha.getTitulo() + " / " + ficha.getAutor() + " - " + 
                    ficha.getAno() + ".\n    " + ficha.getQtdPaginas() + " p.\n\n" + 
                    "    ISBN " + ficha.getIsbn() + "\n\n    " + ficha.getPalavraChave();
        }
        
        return null;
    }
    
    //Palavra com primeira letra em maiuscula
    public String fichaTitle(String palavra) {
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
