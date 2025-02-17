package br.com.pedro.aula2.armazem;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Armazem<Celular> armazemCelular = new Armazem<>("Rua x Bairro Y", "Gerente");
        Armazem<Tablet> armazemTablet = new Armazem<>("Rua y Bairro X", "Gerente 2");

        Celular celular = new Celular();
        celular.setMarca("Apple");
        celular.setModelo("Iphone 10");
        celular.setMemoriaRam("8GB");

        Celular celularAndroid = new Celular();
        celularAndroid.setMarca("Android");
        celularAndroid.setModelo("Galaxy");
        celularAndroid.setMemoriaRam("16GB");

        armazemCelular.adicionarProduto(celular);
        armazemCelular.adicionarProduto(celularAndroid);

        System.out.println("---------------");

        List<Celular> listaRetornada = armazemCelular.retornarProdutos();

        for(Celular valores : listaRetornada){
            System.out.println(valores.getMarca());
            System.out.println(valores.getModelo());
        }

    }
}
