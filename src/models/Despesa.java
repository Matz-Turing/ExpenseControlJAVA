package models;

public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    public Despesa(String descricao) {
        this.descricao = descricao;
        this.valorTotal = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public abstract void cadastrarDespesa(String descricao);
    public abstract double calcularDespesa();
    public abstract String listarDespesa();
}