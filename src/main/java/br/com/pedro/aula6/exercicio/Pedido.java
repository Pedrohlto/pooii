package br.com.pedro.aula6.exercicio;

public class Pedido {

    private double valorPedido;
    private TipoEntrega tipoEntrega;
//    private CalculoFinalPedido calculoFinalPedido;

    public Pedido(double valorPedido, TipoEntrega tipoEntrega/*, CalculoFinalPedido calculoFinalPedido*/){
        this.valorPedido = valorPedido;
        this.tipoEntrega = tipoEntrega;
        //this.calculoFinalPedido = calculoFinalPedido;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public double valorTotal(){
        return this.valorPedido + tipoEntrega.valorFrete();
    }
}
