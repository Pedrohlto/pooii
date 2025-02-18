package br.com.pedro.aula2.exercicio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        MinhaLista<Roupa> listaRoupa = new MinhaLista<>("Lista Nome", LocalDate.now());
        Roupa roupa = new Roupa();
        roupa.setCor("Preta");
        roupa.setModelo("Camiseta");

        listaRoupa.adicionar(roupa);
        listaRoupa.remover(roupa);

        String exibir = listaRoupa.exibirLista();
        System.out.println(exibir);


//        MinhaLista<Notebook> minhaLista = new MinhaLista<>("Lista de Teste", LocalDate.now());
//
//        Notebook notebook = new Notebook();
//        notebook.setMarca("Lenovo");
//        notebook.setModelo("Linkpad");
//        notebook.setMemoria("8G");
//
//        Notebook notebook2 = new Notebook();
//        notebook2.setMarca("Positivo");
//        notebook2.setModelo("idea");
//        notebook2.setMemoria("16G");
//
//        minhaLista.adicionar(notebook);
//        minhaLista.adicionar(notebook2);
//
//        System.out.println("*******");
//
//        minhaLista.remover(notebook);
//
//        System.out.println("*******");
//
//        String retorno = minhaLista.exibirLista();
//        System.out.println(retorno);

    }
}
