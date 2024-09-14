package models;

import java.util.Scanner;

public class Diaria extends Despesa {
    private int qtdDiarias;

    public Diaria(String descricao) {
        super(descricao);
    }

    @Override
    public void cadastrarDespesa(String descricao) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de diárias: ");
        this.qtdDiarias = input.nextInt();
        input.nextLine(); // Limpar o buffer
    }

    @Override
    public double calcularDespesa() {
        this.setValorTotal(this.qtdDiarias * 50);
        return this.getValorTotal();
    }

    @Override
    public String listarDespesa() {
        return "Descrição: " + this.getDescricao() +
                "\nQuantidade de Diárias: " + this.qtdDiarias +
                "\nValor Total: R$ " + String.format("%.2f", this.getValorTotal());
    }

    // Getters e Setters
    public int getQtdDiarias() {
        return qtdDiarias;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }
}