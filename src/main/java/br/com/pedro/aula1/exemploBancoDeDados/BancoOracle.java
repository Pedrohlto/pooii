package br.com.pedro.aula1.exemploBancoDeDados;

public class BancoOracle implements BancoDeDados{
    @Override
    public void salvar(Pessoa pessoa) {
        System.out.println("Solicitar usuario");
        System.out.println("Recuperar uma lib de conexão");
    }

    @Override
    public void alterar(Pessoa pessoa) {

    }

    @Override
    public void excluir(Pessoa pessoa) {

    }
}
