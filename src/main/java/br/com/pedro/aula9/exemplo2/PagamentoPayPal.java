package br.com.pedro.aula9.exemplo2;

public class PagamentoPayPal implements MeioPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via PayPal: R$" + valor);
    }
}
