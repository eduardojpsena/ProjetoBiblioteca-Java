package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entity.Aluguel;
import model.entity.Espaco;
import model.entity.Evento;
import model.entity.FichaCatalografica;
import model.entity.Livro;
import model.entity.SalaEstudo;
import model.entity.Usuario;
import model.service.EventoService;
import model.service.FichaCatalograficaService;
import model.service.LivroService;
import model.service.SalaEstudoService;
import model.service.UsuarioService;

public class Main {

    public static void main(String[] args) throws IOException {
        
        /*//Cadastrar eventos
        EventoService eventoService = new EventoService();
        Espaco espaco1 = new Espaco(1, "Piso Superior", 55);
        eventoService.cadastrarEvento(1, "Outubro Rosa", espaco1, "20/12/2020","18:00");
        Espaco espaco2 = new Espaco(2, "Entrada", 150);
        eventoService.cadastrarEvento(2, "Novembro Azul", espaco2, "09/12/2020","15:00");
        Espaco espaco3 = new Espaco(3, "Hall", 40);
        eventoService.cadastrarEvento(3, "Novembro Azul", espaco3, "09/12/2020","18:00");
        
        List<Evento> eventos = eventoService.listarEvento();
        for (Evento evento : eventos) {
                System.out.println(evento);
        }

        eventoService.exportarEvento(eventos);*/
        
        /*//Cadastrar salasEstudo
        SalaEstudoService salaService = new SalaEstudoService();
        salaService.cadastrarSalasEstudo(1, "Sala 1", false);
        salaService.cadastrarSalasEstudo(2, "Sala 2", false);
        salaService.cadastrarSalasEstudo(3, "Sala 3", false);
        salaService.cadastrarSalasEstudo(4, "Sala 4", false);
        
        List<SalaEstudo> salas = salaService.listarSalas();
        for (SalaEstudo sala : salas) {
            System.out.println(sala);
        }
        
        salaService.exportarSala(salas);*/
        
        /*//Importar dados de salas de estudo
        SalaEstudoService salaService = new SalaEstudoService();
        try {
            List<SalaEstudo> salasEstudo = salaService.importarArquivo("src/main/java/files/salasEstudo.txt");
            for (SalaEstudo salaEstudo : salasEstudo) {
                System.out.println("Salas importadas do txt com sucesso");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
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
            List<Usuario> usuarios = userService.importarArquivo("src/main/java/files/usuarios.txt");
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
        List<Livro> livros = livroService.listarLivro(); 
        for (Livro livro : livros) {
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
            List<Livro> livros = livroService.importarArquivo("src/main/java/files/livros.txt");
            for (Livro livro : livros) {
                //System.out.println("Livros importados do txt: " + livro);
            }

        } catch (Exception e) {
                e.printStackTrace();
        }*/
        
        //System.out.println(livroService.fichaCatalografica("Mulheres que correm com os lobos"));
        
        /*List<Livro> livros = livroService.listarLivro();
        List<Livro> livrosEnc = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTema().equals("Psicologia2")){
                
                livrosEnc.add(livro);
            } 
        }
        System.out.println(livrosEnc.size());
        
        System.out.println(livrosEnc);*/
        
        /*//Aluguel de livros
        livroService.alugarLivro("Do Mil Ao Milhao");
        System.out.println("Livro alugado");
        List<Livro> livros = livroService.listarLivro();
        
        livroService.exportarLivro(livros);*/
        
        
        //Cadastrar ficha catalografica e exportar dados para arquivo txt
        FichaCatalograficaService fichasService = new FichaCatalograficaService();
        fichasService.cadastrarFicha(1, "Producao Artesanal De Cerveja Pilsen", "Eduardo Sena"
                , "2018", 50, "12-34567-89-0", "Cerveja, Quimica, Producao Artesanal");
        fichasService.cadastrarFicha(2, "Analise Ambiental De Terreno Industrial", "Andre Luis"
                , "2017", 65, "98-78563-21-0", "Meio Ambiente, Industria, Ecossistema");
        List<FichaCatalografica> fichasCat = fichasService.listarFichas();
        for (FichaCatalografica fichaCatalografica : fichasCat) {
            System.out.println(fichaCatalografica);
        }
        
        System.out.println(fichasCat.get(fichasCat.size()-1).getId() + 1);
        
        //fichasService.exportarFichas(fichasCat);
        
        System.out.println(fichasService.VisualizarFichaCatalografica("Producao Artesanal De Cerveja Pilsen"));
    }
}
