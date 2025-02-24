package br.com.pedro.aula6.exercicio;

public class Main {

    public static void main(String[] args) {
        //TipoEntrega entregaInternacional = ;
        Expressa expressa = new Expressa();

        Pedido pedido = new Pedido(800, expressa);
        Pedido pedido2 = new Pedido(800, new Padrao());

        System.out.println("Valor do primeiro pedido: " + pedido.valorTotal());
        System.out.println("Valor do segundo pedido: " + pedido2.valorTotal());


    }
}
