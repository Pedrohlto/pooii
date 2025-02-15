package br.com.pedro.aula1.exercicio;

public class Documento implements Imprimivel{
    @Override
    public void imprimir() {
        System.out.println("Imprimindo através da Classe Documento");
    }
}
