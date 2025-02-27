package br.com.pedro.aula9.exemplo4.domain;


import java.time.LocalDate;
import java.util.List;


public class Reserva {

    public Reserva(String vendaId, List<Produto> produtos) {
        this.vendaId = vendaId;
        this.produtos = produtos;
        this.dataReserva = LocalDate.now();
    }

    private String id;
    private String vendaId;
    private List<Produto> produtos;
    private LocalDate dataReserva;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendaId() {
        return vendaId;
    }

    public void setVendaId(String vendaId) {
        this.vendaId = vendaId;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }
}
