import models.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GerenciadorDespesa gerenciador = new GerenciadorDespesa();

        // Loop para o menu
        while (true) {
            // Exibe as opções do menu
            System.out.println("\n===== Controle de Despesas =====");
            System.out.println("1. Cadastrar Despesa");
            System.out.println("2. Listar Despesas");
            System.out.println("3. Calcular Despesas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            int opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer

            // Processa a opção do usuário
            switch (opcao) {
                case 1:
                    // Cadastrar despesa
                    System.out.println("\n===== Cadastrar Despesa =====");
                    System.out.println("1. Alimentação");
                    System.out.println("2. Transporte");
                    System.out.println("3. Diária");
                    System.out.print("Escolha o tipo de despesa: ");
                    int tipoDespesa = input.nextInt();
                    input.nextLine(); // Limpar o buffer

                    System.out.print("Informe a descrição da despesa: ");
                    String descricao = input.nextLine();

                    Despesa novaDespesa = null;
                    switch (tipoDespesa) {
                        case 1:
                            novaDespesa = new Alimentacao(descricao);
                            break;
                        case 2:
                            novaDespesa = new Transporte(descricao);
                            break;
                        case 3:
                            novaDespesa = new Diaria(descricao);
                            break;
                        default:
                            System.out.println("Tipo de despesa inválido!");
                            break;
                    }

                    if (novaDespesa != null) {
                        novaDespesa.cadastrarDespesa(descricao);
                        gerenciador.adicionarDespesa(novaDespesa);
                        System.out.println("Despesa cadastrada com sucesso!");
                    }
                    break;
                case 2:
                    // Listar despesas
                    System.out.println("\n===== Listar Despesas =====");
                    gerenciador.listarDespesas();
                    break;
                case 3:
                    // Calcular despesas
                    System.out.println("\n===== Calcular Despesas =====");
                    System.out.println("Total de despesas com Alimentação: R$ " + String.format("%.2f", gerenciador.getTotalAlimentacao()));
                    System.out.println("Total de despesas com Transporte: R$ " + String.format("%.2f", gerenciador.getTotalTransporte()));
                    System.out.println("Total de despesas com Diárias: R$ " + String.format("%.2f", gerenciador.getTotalDiaria()));
                    System.out.println("Total de Despesas: R$ " + String.format("%.2f", gerenciador.getTotalDespesas()));
                    break;
                case 0:
                    // Sair do programa
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    // Opção inválida
                    System.out.println("Opção inválida!");
            }
        }
    }
}