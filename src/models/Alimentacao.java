package models;

import java.util.Scanner;

public class Alimentacao extends Despesa {
    private String nomeRestaurante;
    private int qtdRefeicao;

    public Alimentacao(String descricao) {
        super(descricao);
    }

    @Override
    public void cadastrarDespesa(String descricao) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome do restaurante: ");
        this.nomeRestaurante = input.nextLine();
        System.out.print("Informe a quantidade de refeições: ");
        this.qtdRefeicao = input.nextInt();
        input.nextLine(); // Limpar o buffer
    }

    @Override
    public double calcularDespesa() {
        this.setValorTotal(this.qtdRefeicao * 18);
        return this.getValorTotal();
    }

    @Override
    public String listarDespesa() {
        return "Descrição: " + this.getDescricao() +
                "\nRestaurante: " + this.nomeRestaurante +
                "\nQuantidade de Refeições: " + this.qtdRefeicao +
                "\nValor Total: R$ " + String.format("%.2f", this.getValorTotal());
    }

    // Getters e Setters
    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }
}