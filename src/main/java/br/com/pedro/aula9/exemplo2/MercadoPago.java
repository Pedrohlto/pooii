package br.com.pedro.aula9.exemplo2;

public class MercadoPago extends MeioPagamento implements MeioPagamentoInterface, MeioPagamentoOnline {

    public MercadoPago(String nomeMeioPagamento) {
        super(nomeMeioPagamento);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagando via mercado pago" + valor);

    }
}
