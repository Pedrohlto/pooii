package br.com.pedro.aula9.exemplo2;

public class Checkout {

    private MeioPagamento pagamento; // Forte acoplamento

    public Checkout(MeioPagamento pagamento) {
        this.pagamento = pagamento; // Dependência criada dentro da classe
    }

    public void setPagamento(MeioPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor) {
        System.out.println("Finalizando compra...");
        pagamento.processarPagamento(valor);
    }
}
