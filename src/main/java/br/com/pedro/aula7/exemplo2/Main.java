package br.com.pedro.aula7.exemplo2;

public class Main {

    public static void main(String[] args) {
        AvesQueVoam passarinho = new Passarinho();
        passarinho.alimentar();
        passarinho.voar();

        Ave pinguim = new Pinguim();
        pinguim.alimentar();

//
//        try{
//            /** Corpo do metodo/escopo**/
//        } catch(UnsupportedOperationException ex){
//            System.out.println();
//        }
    }
}
