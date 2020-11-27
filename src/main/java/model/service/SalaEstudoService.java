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
import model.entity.SalaEstudo;
        
public class SalaEstudoService {
    public List<SalaEstudo> salasEstudo = new ArrayList<SalaEstudo>();
        
    //Cadastrar salas e adicionar a lista de salas de estudo
    public SalaEstudo cadastrarSalasEstudo(long id, String nome, boolean status){
        SalaEstudo salaEstudo = new SalaEstudo(id, nome, status);
        salasEstudo.add(salaEstudo);
        
        return salaEstudo;
    }
    
    //Listar Salas Cadastradas
    public List<SalaEstudo> listarSalas() {
        return salasEstudo;
    }
    
    //Exportar salas de estudo para arquivo txt
    public void exportarSala(List<SalaEstudo> salasEstudo) throws IOException {
        File diretorio = new File("src/main/java/files");
        diretorio.mkdir();

        if (diretorio.isDirectory()) {
            FileWriter arquivo = new FileWriter("src/main/java/files/salasEstudo.txt", false);
            arquivo.write("ID,"+"NOME,"+"STATUS\n");
            for (SalaEstudo salaEstudo : salasEstudo) {
                arquivo.write(salaEstudo.getId() + "," + salaEstudo.getNome() 
                        + "," + salaEstudo.getStatus() + "\n");
            }
            arquivo.close();
        }
    }
    
    //importar Salas de estudo de arquivo txt
    public List<SalaEstudo> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        // Pualando a primeira linha do arquivo(Colunas)
        br.readLine();
        while (br.ready()) {
                String linha = br.readLine();
                //System.out.println(linha);
                String[] colunas = linha.split(",");
                cadastrarSalasEstudo(Long.parseLong(colunas[0]), colunas[1], Boolean.parseBoolean(colunas[2]));
        }

        br.close();
        return salasEstudo;
    }
}
