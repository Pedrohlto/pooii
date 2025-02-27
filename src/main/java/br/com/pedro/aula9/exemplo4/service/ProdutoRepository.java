package br.com.pedro.aula9.exemplo4.service;

import br.com.pedro.aula9.exemplo4.domain.Produto;
import br.com.pedro.aula9.exemplo4.domain.Reserva;

public interface ProdutoRepository {

    public Produto buscarProduto(String id);

    public Reserva criarReserva(Reserva reserva);
}
