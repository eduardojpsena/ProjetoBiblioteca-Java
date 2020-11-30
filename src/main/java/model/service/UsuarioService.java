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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.entity.Espaco;
import model.entity.Evento;
import model.entity.Usuario;

public class UsuarioService {
    public List<Usuario> usuarios= new ArrayList<Usuario>();

    //Cadastrar usuarios e adicionar a lista de usuarios
    public Usuario cadastrarUsuario(long id, String nome, String login, String senha, String tipo) throws IOException {
        Usuario usuario = new Usuario(id, nome, login, senha, tipo);
        usuarios.add(usuario);

        return usuario;
    }

    //Remover usuario da lista de usuarios
    public void removerUsuario(String user) {
        for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getLogin().equals(user)) {
                        usuarios.remove(i);
                }
        }
    }

    public List<Usuario> listarUsuario() {
        return usuarios;
    }

    //Exportar dados da lista de usuarios para um arquivo externo .txt
    public void exportarUsuario(List<Usuario> usuarios) throws IOException {
        File diretorio = new File("src/main/java/files");
        diretorio.mkdir();

        if (diretorio.isDirectory()) {
                FileWriter arquivo = new FileWriter("src/main/java/files/usuarios.txt", false);
                arquivo.write("ID,"+"NOME,"+"LOGIN,"+"SENHA,"+"TIPO\n");
                for (Usuario usuario : usuarios) {
                        arquivo.write(usuario.getId() + "," + usuario.getNome() + "," + usuario.getLogin() + ","
                + usuario.getSenha() + "," + usuario.getTipo()+ "\n");
                }
                arquivo.close();
        }
    }

    //Importar dados de um arquivo .txt para a lista de usuarios
    public List<Usuario> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        // Pulando a primeira linha do arquivo(Colunas)
        br.readLine();
        while (br.ready()) {
                String linha = br.readLine();
                //System.out.println(linha);
                String[] colunas = linha.split(",");
                cadastrarUsuario(Long.parseLong(colunas[0]), colunas[1], colunas[2], colunas[3], colunas[4]);
        }

        br.close();
        return usuarios;
    }
	
    //Gerar relatório
    public void gerarRelatorio(List<Usuario> usuarios, String caminho, String nomeArquivo) throws IOException{
        int userInt = 0, userExt = 0, userProf = 0, userFunc = 0;
        File diretorio = new File(caminho);
        diretorio.mkdir();
        
        if (diretorio.isDirectory()) {
            FileWriter arquivo = new FileWriter(caminho +"\\"+ nomeArquivo+".txt", false);
            arquivo.write("         MORAIS LIBRARY         \n");
            arquivo.write("--------------------------------\n");
            arquivo.write("••    RELATORIO DE USUARIOS    ••\n");
            arquivo.write("--------------------------------\n");
            arquivo.write("Usuarios cadastrados: " + usuarios.size() + "\n");
            for (Usuario usuario : usuarios) {
                if (usuario.getTipo().equals("Interno")){
                    userInt++;
                } else if(usuario.getTipo().equals("Externo")){
                    userExt++;
                } else if(usuario.getTipo().equals("Professor")){
                    userProf++;
                } else if(usuario.getTipo().equals("Funcionario")){
                    userFunc++;
                }
            }
            arquivo.write("Usuarios internos cadastrados: " + userInt + "\n");
            arquivo.write("Usuarios externos cadastrados: " + userExt + "\n");
            arquivo.write("Professores cadastrados: " + userProf + "\n");
            arquivo.write("Funcionarios cadastrados: " + userFunc + "\n");
            arquivo.write("---------------------------------\n");
            arquivo.close();
        }
    }
}
