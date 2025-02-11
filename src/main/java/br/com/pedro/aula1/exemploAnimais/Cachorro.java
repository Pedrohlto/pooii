package br.com.pedro.aula1.exemploAnimais;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Cachorro Latindo");
    }

    @Override
    public String getNome(){
        return "Qualquer outra coisa";
    }

    public void fazerXixiNoPoste(){
        System.out.println("Fazendo xixi no poste");
    }

}
