package sistemaescolar;

import java.util.Scanner;

public class CadastroDeAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de cadastro de alunos!");

        String nome = solicitarNome(scanner);
        int idade = solicitarIdade(scanner);
        String serie = solicitarSerie(scanner);

        System.out.println("Cadastro do aluno " + nome + " realizado com sucesso!");

        if (desejaVisualizar(scanner)) {
            exibirDados(nome, idade, serie);
        } else {
            System.out.println("Ok, os dados não serão exibidos.");
        }

        scanner.close();
    }

    public static String solicitarNome(Scanner scanner) {
        System.out.print("Digite o nome completo do aluno: ");
        return scanner.nextLine();
    }

    public static int solicitarIdade(Scanner scanner) {
        System.out.print("Digite a idade do aluno: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Idade inválida. Digite um número inteiro:");
            scanner.next();
        }
        int idade = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha
        return idade;
    }

    public static String solicitarSerie(Scanner scanner) {
        System.out.print("Insira a série do aluno: ");
        return scanner.nextLine();
    }

    public static boolean desejaVisualizar(Scanner scanner) {
        System.out.print("Você gostaria de visualizar os dados do aluno? (sim/não): ");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("sim");
    }

    public static void exibirDados(String nome, int idade, String serie) {
        System.out.println("Exibindo dados do aluno...");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Série: " + serie);
    }
}
