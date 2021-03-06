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
import model.entity.Espaco;
import model.entity.Evento;


public class EventoService {
    public List<Evento> eventos = new ArrayList<Evento>();

    //Cadastrar evento e adicionar a lista de eventos
    public Evento cadastrarEvento(long id, String nomeEvento, Espaco espaco, String data, String hora) {
        Evento evento = new Evento( id, nomeEvento, espaco , data, hora);
        eventos.add(evento);
        return evento;
    }

    //Listar eventos cadastrados
    public List<Evento> listarEvento() {
        return eventos;
    }

    //Exportar dados da lista de eventos para um arquivo externo .txt
    public void exportarEvento(List<Evento> eventos) throws IOException {
        File diretorio = new File("src/main/java/files");
        diretorio.mkdir();

        if (diretorio.isDirectory()) {
            FileWriter arquivo = new FileWriter("src/main/java/files/eventos.txt", false);
            arquivo.write("ID-EVENTO," + "NOME-EVENTO," + "ID-ESPACO," + "NOME-LOCAL," 
            + "CAPACIDADE," + "DATA," + "HORA\n");
            for (Evento evento : eventos) {
                    arquivo.write(evento.getId() + "," + evento.getNomeEvento() + "," + evento.getEspaco().getId() + ","
            + evento.getEspaco().getNomeLocal() + "," + evento.getEspaco().getCapacidade() + "," 
                                    + evento.getData()+ "," + evento.getHora() + "\n");
            }
            arquivo.close();
        }
    }


    //Importar eventos de um arquivo txt para lista de eventos
    public List<Evento> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        // Pualando a primeira linha do arquivo(Colunas)
        br.readLine();
        while (br.ready()) {
                String linha = br.readLine();
                //System.out.println(linha);
                String[] colunas = linha.split(",");
                Espaco espaco = new Espaco(Long.parseLong(colunas[2]),colunas[3] , Integer.parseInt(colunas[4]));
                cadastrarEvento(Long.parseLong(colunas[0]), colunas[1], espaco, colunas[5], colunas[6]);
                System.out.println("Id Evento: " + colunas[0]);

        }

        br.close();
        return eventos;
    }
    
    //Gerar relatorio
    public void gerarRelatorio(List<Evento> eventos, String caminho, String nomeArquivo) throws IOException{
        File diretorio = new File(caminho);
        diretorio.mkdir();
        
        if (diretorio.isDirectory()) {
            FileWriter arquivo = new FileWriter(caminho +"\\"+ nomeArquivo+".txt", false);
            arquivo.write("         MORAIS LIBRARY         \n");
            arquivo.write("----------------------------------\n");
            arquivo.write("••     RELATORIO DE EVENTOS     ••\n");
            arquivo.write("----------------------------------\n");
            arquivo.write("Eventos cadastrados: " + eventos.size() + "\n");
            for (Evento evento : eventos) {
                arquivo.write("----------------------------------\n");
                arquivo.write("ID: " + evento.getId() 
                            + "\nNOME EVENTO: " + evento.getNomeEvento() 
                            + "\nLOCAL: " + evento.getEspaco().getNomeLocal() 
                            + "\nCAPACIDADE: " + evento.getEspaco().getCapacidade()
                            + "\nDATA: " + evento.getData()
                            + "\nHORA: " + evento.getHora() + "\n");
            }
            
            arquivo.close();
        }
    }
}
