package br.com.pedro.aula9.exemplo4.infra;

import br.com.pedro.aula9.exemplo4.domain.Produto;
import br.com.pedro.aula9.exemplo4.domain.Reserva;
import br.com.pedro.aula9.exemplo4.service.ProdutoRepository;

public class ReservaProdutoRepository implements ProdutoRepository {

    public Produto buscarProduto(String id) {
        System.out.println("regra de acesso ao banco de dados oracle");
        System.out.println("Query de select com caracteristicas do Oracle");
        return new Produto("20-30-40", 20);
    }

    public Reserva criarReserva(Reserva reserva) {
        System.out.println("regra de acesso ao banco de dados oracle");
        System.out.println("Query de select com caracteristicas do Oracle");
        System.out.println("Reserva criada com sucesso");
        return reserva;
    }

}
