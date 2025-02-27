package br.com.pedro.aula9.exemplo2;

public class Main {

    public static void main(String[] args) {

        Checkout checkout = new Checkout(new PagamentoPayPal());
        MeioPagamento meioPagamento = new MeioPagamento();
        try {
            checkout.finalizarCompra(150.0);
        } catch(Exception ex){
            checkout.setPagamento(new MercadoPago());
            checkout.finalizarCompra(150.0);
        }

        //checkout.setPagamento(new MercadoPago());

    }
}
