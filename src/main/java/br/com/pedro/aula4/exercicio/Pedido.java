package br.com.pedro.aula4.exercicio;

public class Pedido {
    private int id;
    private double valor;

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void salvarNoBanco() {
        System.out.println("Salvando pedido no banco de dados...");
    }

    public void enviarNotificacao() {
        System.out.println("Enviando notificação do pedido...");
    }

    public double calcularTaxaEntrega() {
        return valor * 0.1;
    }

    public void gerarRecibo() {
        System.out.println("Gerando recibo do pedido...");
    }
}