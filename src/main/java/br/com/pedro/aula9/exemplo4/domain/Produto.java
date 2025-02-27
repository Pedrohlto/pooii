package br.com.pedro.aula9.exemplo4.domain;


public class Produto {

    private String id;
    private Integer quantidadeDisponivel;

    public Produto(String id, Integer quantidadeReservada) {
        this.id = id;
        this.quantidadeDisponivel = quantidadeReservada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
