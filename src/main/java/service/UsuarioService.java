package service;

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

import model.Espaco;
import model.Evento;
import model.Usuario;

public class UsuarioService {
	public List<Usuario> usuarios= new ArrayList<Usuario>();
	
	//Cadastrar usuários e adicionar a lista de usuários
	public Usuario cadastrarUsuario(long id, String nome, String login, String senha, String tipo) throws IOException {
		Usuario usuario = new Usuario(id, nome, login, senha, tipo);
		usuarios.add(usuario);
		
		return usuario;
	}
	
	//Remover usuário da lista de usuários
	public void removerUsuario(String user) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getNome().equals(user)) {
				usuarios.remove(i);
			}
		}
	}
	
	public List<Usuario> listarUsuario() {
		return usuarios;
	}
	
	//Exportar dados da lista de usuarios para um arquivo externo .txt
	public void exportarUsuario(List<Usuario> usuarios) throws IOException {
		File diretorio = new File("C:/Users/eduar/OneDrive/Área de Trabalho/");
		diretorio.mkdir();
		
		if (diretorio.isDirectory()) {
			FileWriter arquivo = new FileWriter("C:/Users/eduar/OneDrive/Área de Trabalho/usuarios.txt", false);
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
		// Pualando a primeira linha do arquivo(Colunas)
		br.readLine();
		while (br.ready()) {
			String linha = br.readLine();
			System.out.println(linha);
			String[] colunas = linha.split(",");
			cadastrarUsuario(Long.parseLong(colunas[0]), colunas[1], colunas[2], colunas[3], colunas[4]);
		}
		
		br.close();
		return usuarios;
	}
	
	
}
