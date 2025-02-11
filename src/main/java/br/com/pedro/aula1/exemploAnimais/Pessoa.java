package br.com.pedro.aula1.exemploAnimais;

import java.util.List;

public class Pessoa {

    private String nome;
    private String telefone;
    private Animal animal;

    public void adotar(Animal animal){
        if (animal.isDisponivelParaAdocao()){
            this.animal = animal;
            animal.setDisponivelParaAdocao(false);
        }
    }

    public Animal getAnimalAdotado(){
        return this.animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
