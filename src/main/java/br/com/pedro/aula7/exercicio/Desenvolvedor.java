package br.com.pedro.aula7.exercicio;

public class Desenvolvedor extends Funcionario {
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvendo software...");
    }

    @Override
    public void baterPonto() {
        throw new UnsupportedOperationException("Desenvolvedor não bate ponto.");
    }

    @Override
    public void fazerPausa() {
        System.out.println("Pausa para café.");
    }

    @Override
    public void atenderCliente() {
        throw new UnsupportedOperationException("Desenvolvedor não atende clientes.");
    }

    @Override
    public void programar() {
        System.out.println("Escrevendo código em Java.");
    }

    @Override
    public void gerenciarProjeto() {
        throw new UnsupportedOperationException("Desenvolvedor não gerencia projetos.");
    }
}



