package br.com.pedro.aula2.armazem;

import java.util.ArrayList;
import java.util.List;

public class Armazem<T> {

    private String endereco;
    private String gerente;
    private List<T> produtos;

    public Armazem(String endereco, String gerente){
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
        this.gerente = gerente;
    }

    public Armazem(String endereco, String gerente, List<T> lista){
        this.endereco = endereco;
        this.produtos = lista;
        this.gerente = gerente;
    }

    public void adicionarProduto(T produto){
        this.produtos.add(produto);
    }

    public List<T> retornarProdutos(){
        return this.produtos;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }



    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}
