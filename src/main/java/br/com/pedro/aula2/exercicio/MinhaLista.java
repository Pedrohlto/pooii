package br.com.pedro.aula2.exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T> {

    private String nome;
    private LocalDate dataLimite;
    private List<T> elementos;

    public MinhaLista(String nome, LocalDate dataLimite ){
        this.nome = nome;
        this.dataLimite = dataLimite;
        this.elementos = new ArrayList<>();
    }

    public void adicionar(T elemento){
        this.elementos.add(elemento);
    }

    public void remover(T elemento){
        this.elementos.remove(elemento);
    }

    public boolean buscar(T elemento){
      return this.elementos.contains(elemento);
    }

    public int tamanho(){
        return this.elementos.size();
    }

    public void limpar(){
        this.elementos.clear();
    }

    public String exibirLista(){
        String saida = " Nome"+ this.nome;
        saida.concat("Data Limite " + this.dataLimite);
        saida.concat("Elementos " + this.elementos);
        return saida;

//        System.out.println("Nome " + this.nome);
//        System.out.println("Data Limite " + this.dataLimite);
//        System.out.println(this.elementos);
//
//        for(T elemento : this.elementos){
//            System.out.println(elemento);
//        }
    }

    public boolean estaExpirada(){
        return LocalDate.now().isAfter(this.dataLimite);
    }
}
