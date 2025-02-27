package br.com.pedro.aula9.exemplo4;

import br.com.pedro.aula9.exemplo4.domain.Produto;
import br.com.pedro.aula9.exemplo4.domain.Reserva;
import br.com.pedro.aula9.exemplo4.infra.AvisarEstoque;
import br.com.pedro.aula9.exemplo4.infra.ReservaProdutoRepository;
import br.com.pedro.aula9.exemplo4.service.ReservaProdutoService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("1", 10);
        Reserva reserva = new Reserva("1", List.of(produto));
        ReservaProdutoService reservaProdutoService = new ReservaProdutoService();
        reservaProdutoService.reservar(reserva, new AvisarEstoque(), new ReservaProdutoRepository());
    }
}
