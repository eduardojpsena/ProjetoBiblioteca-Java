
package model.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.entity.Espaco;

/**
 *
 * @author eduardoSena
 */
public class EspacoService {
    public List<Espaco> espacos = new ArrayList<Espaco>();
    
    //Cadastrar espaco e adicionar a lista de espaco
    public Espaco cadastrarEspaco(long id, String nomeLocal, int capacidade) {
        Espaco espaco = new Espaco(id, nomeLocal, capacidade);
        espacos.add(espaco);
        return espaco;
    }    
    
    //Listar espacos cadastrados
    public List<Espaco> listarEspaco() {
        return espacos;
    }
    
    //Exportar dados da lista de espacos para um arquivo externo .txt
    public void exportarEspaco(List<Espaco> espacos) throws IOException {
        File diretorio = new File("src/main/java/files");
        diretorio.mkdir();

        if (diretorio.isDirectory()) {
            FileWriter arquivo = new FileWriter("src/main/java/files/espaco.txt", false);
            arquivo.write("ID," + "NOME," + "CAPACIDADE\n");
            for (Espaco espaco : espacos) {
                    arquivo.write(espaco.getId() + "," + espaco.getNomeLocal() + "," + espaco.getCapacidade()+ "\n");
            }
            arquivo.close();
        }
    }
    
    //Importar eventos de um arquivo txt para lista de eventos
    public List<Espaco> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        // Pualando a primeira linha do arquivo(Colunas)
        br.readLine();
        while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
                String[] colunas = linha.split(",");
                cadastrarEspaco(Long.parseLong(colunas[0]),colunas[1] , Integer.parseInt(colunas[2]));
        }

        br.close();
        return espacos;
    }
}
