package br.com.pedro.aula1.exemploBancoDeDados;

public interface BancoDeDados {

    void salvar(Pessoa pessoa);
    void alterar(Pessoa pessoa);
    void excluir(Pessoa pessoa);
}
