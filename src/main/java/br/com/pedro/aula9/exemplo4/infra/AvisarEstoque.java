package br.com.pedro.aula9.exemplo4.infra;

import br.com.pedro.aula9.exemplo4.domain.Reserva;
import br.com.pedro.aula9.exemplo4.service.NotificacaoEstoque;

public class AvisarEstoque implements NotificacaoEstoque {
    public void reservarEstoque(Reserva reserva) {
        System.out.println("Estoque reservado com sucesso");
    }
}
