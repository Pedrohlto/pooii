package br.com.pedro.aula9.exemplo2;

public abstract class MeioPagamento {

    public MeioPagamento(String nomeMeioPagamento){

    }

    void processarPagamento(double valor){
        System.out.println("corpo Padrão para classe abstrata");
    }


}
