package models;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDespesa {
    private int qtdeAlimentacao;
    private int qtdeTransporte;
    private int qtdeDiaria;
    private double totalAlimentacao;
    private double totalTransporte;
    private double totalDiaria;
    private double totalDespesas;
    private List<Despesa> despesas;

    public GerenciadorDespesa() {
        this.despesas = new ArrayList<>();
    }

    public void adicionarDespesa(Despesa despesa){
        this.despesas.add(despesa);
        if (despesa instanceof Alimentacao) {
            this.qtdeAlimentacao++;
            this.totalAlimentacao += despesa.calcularDespesa();
        } else if (despesa instanceof Transporte) {
            this.qtdeTransporte++;
            this.totalTransporte += despesa.calcularDespesa();
        } else if (despesa instanceof Diaria) {
            this.qtdeDiaria++;
            this.totalDiaria += despesa.calcularDespesa();
        }
        this.totalDespesas += despesa.getValorTotal();
    }

    public void listarDespesas(){
        for(Despesa d : despesas){
            System.out.println("------------------");
            System.out.println(d.listarDespesa());
        }
    }

    // Getters
    public int getQtdeAlimentacao() {
        return qtdeAlimentacao;
    }

    public int getQtdeTransporte() {
        return qtdeTransporte;
    }

    public int getQtdeDiaria() {
        return qtdeDiaria;
    }

    public double getTotalAlimentacao() {
        return totalAlimentacao;
    }

    public double getTotalTransporte() {
        return totalTransporte;
    }

    public double getTotalDiaria() {
        return totalDiaria;
    }

    public double getTotalDespesas() {
        return totalDespesas;
    }
}