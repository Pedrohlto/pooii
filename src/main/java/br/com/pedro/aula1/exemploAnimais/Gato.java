package br.com.pedro.aula1.exemploAnimais;

public class Gato extends Animal implements AdotavelInterface{

    @Override
    public void emitirSom(){
        System.out.println("Gato Miando");
    }

    @Override
    public void proteger() {
        System.out.println("Unhar");
    }

    @Override
    public void treinar() {

    }
}
