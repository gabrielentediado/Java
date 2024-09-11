package br.aprendendo.exemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorMatrizes {
    private Map<String, Matriz> matrizes = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciadorMatrizes gerenciador = new GerenciadorMatrizes();
        gerenciador.menu();
    }

    public void menu() {
        while (true) {
            System.out.println("1. Criar nova matriz");
            System.out.println("2. Listar matrizes");
            System.out.println("3. Escolher matriz para operação");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    criarMatriz();
                    break;
                case 2:
                    listarMatrizes();
                    break;
                case 3:
                    escolherMatriz();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    private void criarMatriz() {
        System.out.print("Nome da matriz: ");
        String nome = scanner.nextLine();
        System.out.print("Número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Número de colunas: ");
        int colunas = scanner.nextInt();
        Matriz matriz = new Matriz(linhas, colunas);

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz.setElemento(i, j, scanner.nextInt());
            }
        }
        matrizes.put(nome, matriz);
        System.out.println("Matriz " + nome + " criada com sucesso!");
    }

    private void listarMatrizes() {
        System.out.println("Matrizes disponíveis:");
        for (String nome : matrizes.keySet()) {
            System.out.println(nome);
        }
    }

    private void escolherMatriz() {
        System.out.print("Nome da matriz: ");
        String nome = scanner.nextLine();
        Matriz matriz = matrizes.get(nome);

        if (matriz == null) {
            System.out.println("Matriz não encontrada.");
            return;
        }

        System.out.println("1. Imprimir matriz");
        System.out.println("2. Transpor matriz");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                matriz.imprimir();
                break;
            case 2:
                Matriz transposta = matriz.transpor();
                transposta.imprimir();
                break;
            default:
                System.out.println("Escolha inválida.");
        }
    }
}
