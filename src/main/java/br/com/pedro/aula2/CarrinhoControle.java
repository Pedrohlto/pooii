package br.com.pedro.aula2;

public class CarrinhoControle<C> {

    private C combustivel;

    private void abastecer(C combutivelGenerico){
        this.combustivel = combutivelGenerico;
    }

    private void acelerar(){
        System.out.println("Acelerando");
    }

    private void ligar(){
        System.out.println("Acelerando");
    }

    private void desligar(){
        System.out.println("Acelerando");
    }

}
