package br.com.pedro.aula9.exemplo4.service;


import br.com.pedro.aula9.exemplo4.domain.Reserva;
import br.com.pedro.aula9.exemplo4.infra.AvisarEstoque;
import br.com.pedro.aula9.exemplo4.infra.ReservaProdutoRepository;

public class ReservaProdutoService  {

    private ProdutoRepository produtoRepository;
    private NotificacaoEstoque notificacaoEstoque;

    public Reserva reservar(Reserva reserva, NotificacaoEstoque notificacaoEstoque, ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
        this.notificacaoEstoque = notificacaoEstoque;

        if(reserva.getProdutos().isEmpty()) throw new RuntimeException("Reserva sem produtos");
        reserva.getProdutos().forEach(produto -> {
            var produtoRecuperado = produtoRepository.buscarProduto(produto.getId());

            if(produtoRecuperado.getQuantidadeDisponivel() < produto.getQuantidadeDisponivel())
                throw new RuntimeException("Quantidade indisponível");
        });

        notificacaoEstoque.reservarEstoque(reserva);
        var reservaSalva = produtoRepository.criarReserva(reserva);
        return reservaSalva;
    }
}
