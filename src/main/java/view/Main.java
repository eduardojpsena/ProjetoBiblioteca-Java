package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Aluguel;
import model.Espaco;
import model.Evento;
import model.Livro;
import model.Usuario;
import service.EventoService;
import service.LivroService;
import service.UsuarioService;

public class Main {

    public static void main(String[] args) throws IOException {


        /*Usuario user = new Usuario("Andre", "123", "101010", "Externo");
        Usuario user2 = new Usuario("Erick", "456", "202020", "Interno");

        listaUsuario.add(user);
        listaUsuario.add(user2);


        for (Usuario usuario : listaUsuario) {
                System.out.println(usuario.toString());
        }*/

        //System.out.println(aluguel1.toString());

        //Cadastrar eventos
        EventoService eventoService = new EventoService();
        Espaco espaco1 = new Espaco(1, "Patio Externo", 2000);
        eventoService.cadastrarEvento(1, "Outubro Rosa", espaco1, "22/11/2020", "18:00");
        Espaco espaco2 = new Espaco(1, "Audotorio", 2000);
        eventoService.cadastrarEvento(2, "Novembro Azul", espaco2, "22/11/2020", "18:00");

        List<Evento> eventos = eventoService.listarEvento();
        for (Evento evento : eventos) {
                System.out.println(evento);
        }

        eventoService.exportarEvento(eventos);

        /*//Cadastrar usuario
        UsuarioService usuarioService = new UsuarioService(); 
        usuarioService.cadastrarUsuario(1,"AndreGao", "arrombado", "123", "Interno"); 

        usuarioService.cadastrarUsuario(2, "PiuPiu", "arrombado2", "123", "Externo"); 

        List<Usuario> usuarios = usuarioService.listarUsuario();
        for (Usuario usuario : usuarios) { 
                System.out.println(usuario); 
        }

        usuarioService.exportarUsuario(usuarios);*/

        /*//Importar dados usuarios
        UsuarioService userService = new UsuarioService();
        try {
                List<Usuario> usuarios = userService.importarArquivo("C:/Users/eduar/OneDrive/�rea de Trabalho/usuarios.txt");
                for (Usuario usuario : usuarios) {
                        System.out.println("Eventos importados do txt: " + usuario);
                }
        } catch (Exception e) {
                e.printStackTrace();
        }*/

        //Remover usuario
        //userService.removerUsuario("Piu");
        //Listar usuario
        //System.out.println(userService.listarUsuario());


        /*//Cadastrar livros
        LivroService livroService = new LivroService();
        livroService.cadastrarLivro(1, "Do mil ao milh�o", "Thiago Nigro", "2018", 5, "Finan�as"); 
        livroService.cadastrarLivro(1, "Do mil ao bilh�o", "Thiago Iork", "2020", 5, "Finan�as"); 
        List<Livro> licros = livroService.listarLivro(); 
        for (Livro livro : licros) {
                System.out.println(livro); 
        }*/



        /*//Importar dados eventos
        EventoService eventoService = new EventoService();
        try {
                List<Evento> eventos = eventoService.importarArquivo("C:/Users/eduar/OneDrive/�rea de Trabalho/eventos.txt");
                for (Evento evento : eventos) {
                        System.out.println("Eventos importados do txt: " + evento);
                }
        } catch (IOException e) {
                e.printStackTrace();
        }*/


        /*//Importar dados livros
        LivroService livroService = new LivroService();
        try {
                List<Livro> livros = livroService.importarArquivo("C:/Users/eduar/OneDrive/�rea de Trabalho/livros.txt");
                for (Livro livro : livros) {
                        System.out.println("Livros importados do txt: " + livro);
                }

        } catch (Exception e) {
                e.printStackTrace();
        }*/

        //Aluguel de livros
        //livroService.alugarLivro("Mulheres que correm com os lobos");



    }
}
