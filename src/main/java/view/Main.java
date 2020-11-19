package view;

import java.util.Scanner;

public class Main {
    
    public static String menuInicial() {
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("• LOGIN •");
        System.out.print("[1] Usuário"
                        + "\n[2] Funcionário"
                        + "\nDigite a opção desejada: ");
        String menu = entrada1.nextLine();
        if (menu.equals("1")) {
                return menuUsuario();
        } else {
                return menuFuncionario();
        }	
    }
    public static String menuUsuario() {
        Scanner entrada = new Scanner(System.in);

        StringBuilder sb = new StringBuilder ();
        sb.append("####################### Menu Usuário ######################## \n");
        sb.append("1- Buscar por livro \n");
        sb.append("2- Reservar livro \n");
        sb.append("3- Alugar livro \n");
        sb.append("4- Solicitar ficha catalografica \n");
        sb.append("5- Reservar sala de estudo \n");
        sb.append("6- Visualizar ficha catalografica \n");
        sb.append("7- Sair \n");
        sb.append("################################################################ \n");

        System.out.print(sb.toString());
        System.out.print("Digite a opção desejada: ");
        return entrada.nextLine();
    }
    
    public static String menuFuncionario() {
        Scanner entrada = new Scanner(System.in);

        StringBuilder sb = new StringBuilder ();
        sb.append("####################### Menu Funcionário ######################## \n");
        sb.append("1- Cadastrar novo usuario \n");
        sb.append("2- Remover usuario \n");
        sb.append("3- Realizar aluguel de livro \n");
        sb.append("4- Cadastrar eventos \n");
        sb.append("5- Adicionar novos espaços \n");
        sb.append("6- Gerar ficha catalografica \n");
        sb.append("7- Importar dados de um arquivo sobre eventos ou funcionarios \n");
        sb.append("8- Gerar relatorio  \n");
        sb.append("9-Sair \n");
        sb.append("################################################################ \n");

        System.out.print(sb.toString());
        return entrada.nextLine();
    }
      
    public static void main(String[] args) {
        
        menuInicial();
        
    } 
}
