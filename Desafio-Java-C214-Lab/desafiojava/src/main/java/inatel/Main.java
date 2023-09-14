package inatel;

// Importando a Biblioteca Scanner para Input
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        // Instânciando Scanner
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Gerenciador gerenciador = new Gerenciador();

        int flag = 0;

        // While enquanto input (flag) != 5
        while (flag != 5) {

            System.out.println("Menu:");
            System.out.println("1. Adicionar um novo filme.");
            System.out.println("2. Marcar um filme como assistido.");
            System.out.println("3. Avaliar um filme.");
            System.out.println("4. Exibir a lista de filmes.");
            System.out.println("5. Sair do programa.");
            System.out.println("Escolha uma opção: " + "\n");

            try {

                flag = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Lançando Exception... " + e.getMessage());
                System.out.println(
                        "Entrada inválida. Por favor entrar com valores inteiros!" + "\n");

                // Comando para consumir a entrada inválida
                scanner.nextLine(); // Consumindo a linha não processada
                continue; // Volta para o início do loop
            }

            switch (flag) {

                case 1:

                    // scanner.nextLine();

                    int id = 0;
                    String titulo = "";
                    int ano = 0;
                    String genero = "";
                    long duracao = 0;

                    System.out.println("Adicionando novo filme... ");
                    System.out.println("Digite o ID, Titulo, Ano, Gênero e Duração do Filme, respectivamente:" + "\n");

                    try {
                        id = scanner.nextInt();
                        scanner.nextLine();
                        titulo = scanner.nextLine();
                        ano = scanner.nextInt();
                        scanner.nextLine();
                        genero = scanner.nextLine();
                        duracao = scanner.nextLong();

                        Filme filme = new Filme(id, titulo, ano, genero, duracao);
                        gerenciador.addFilmes(filme);
                        System.out.println("Filme adicionado com Sucesso!" + "\n");

                    } catch (InputMismatchException e) {
                        System.out.println("Lançando Exception... " + e.getMessage());
                        System.out.println("Não foi possível realizar a Ação desejada!" + "\n");
                        // Comando para consumir a entrada inválida
                        scanner.nextLine(); // Consumindo a linha não processada
                        break;
                    }

                    // Filme filme = new Filme(id, titulo, ano, genero, duracao);
                    // gerenciador.addFilmes(filme);
                    // System.out.println("Filme adicionado com Sucesso!" + "\n");
                    break;

                case 2:

                    if (gerenciador.testEmptyArray()) {
                        System.out.println("Não é possível realizar a ação!" + "\n");
                        break;
                    }

                    id = 0;

                    System.out.println("Marcando filme como Assistido... ");
                    System.out.println("Digite o ID do filme: " + "\n");

                    try {
                        id = scanner.nextInt();
                        scanner.nextLine();
                        gerenciador.markFilmes(id);
                        System.out.println("Filme marcado com Sucesso!" + "\n");

                    } catch (InputMismatchException e) {
                        System.out.println("Lançando Exception... " + e.getMessage());
                        System.out.println("Não foi possível realizar a Ação desejada!" + "\n");
                        // Comando para consumir a entrada inválida
                        scanner.nextLine(); // Consumindo a linha não processada
                        break;
                    }

                    break;

                case 3:

                    if (gerenciador.testEmptyArray()) {
                        System.out.println("Não é possível realizar a ação!" + "\n");
                        break;
                    }

                    id = 0;
                    float nota = 0.0f;

                    System.out.println("Avaliando o filme... ");
                    System.out.println("Observação: Usar vírgula (,) para o valor da nota!");
                    System.out.println("Digite o ID do filme e a nota,  respectivamente: " + "\n");

                    try {
                        id = scanner.nextInt();
                        scanner.nextLine();
                        nota = scanner.nextFloat();
                        scanner.nextLine();
                        gerenciador.rateFilmes(id, nota);
                        System.out.println("Filme avaliado com Sucesso!" + "\n");

                    } catch (InputMismatchException e) {
                        System.out.println("Lançando Exception... " + e.getMessage());
                        System.out.println("Não foi possível realizar a Ação desejada!" + "\n");
                        // Comando para consumir a entrada inválida
                        scanner.nextLine(); // Consumindo a linha não processada
                        break;
                    }

                    break;

                case 4:

                    if (gerenciador.testEmptyArray()) {
                        System.out.println("Não é possível realizar a ação!" + "\n");
                        break;
                    }

                    try {

                        System.out.println("Exibindo a lista de filmes... " + "\n");
                        gerenciador.getFilmes();

                    } catch (Exception e) {
                        System.out.println("Lançando Exception... " + e.getMessage());
                        System.out.println("Não foi possível realizar a Ação desejada!" + "\n");
                        // Comando para consumir a entrada inválida
                        scanner.nextLine(); // Consumindo a linha não processada
                        break;
                    }

                    break;

                case 5:
                    System.out.println("Obrigado. Até mais!" + "\n");
                    break;

                default:
                    System.out.println("Opção inválida!" + "\n");
                    break;

            }

            // System.out.println("Teste..." + "\n");

        }

        scanner.close();

    }
}