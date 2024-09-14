package models;

import java.util.Scanner;

public class Transporte extends Despesa {
    private double kmPercorrida;
    private double valorPedagios;

    public Transporte(String descricao) {
        super(descricao);
    }

    @Override
    public void cadastrarDespesa(String descricao) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quilometragem percorrida: ");
        this.kmPercorrida = input.nextDouble();
        System.out.print("Informe o valor dos pedágios: ");
        this.valorPedagios = input.nextDouble();
        input.nextLine(); // Limpar o buffer
    }

    @Override
    public double calcularDespesa() {
        this.setValorTotal((this.kmPercorrida * 3) + this.valorPedagios);
        return this.getValorTotal();
    }

    @Override
    public String listarDespesa() {
        return "Descrição: " + this.getDescricao() +
                "\nQuilometragem Percorrida: " + this.kmPercorrida + " km" +
                "\nValor dos Pedágios: R$ " + String.format("%.2f", this.valorPedagios) +
                "\nValor Total: R$ " + String.format("%.2f", this.getValorTotal());
    }

    // Getters e Setters
    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }
}