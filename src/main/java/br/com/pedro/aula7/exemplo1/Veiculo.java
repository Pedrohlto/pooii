package br.com.pedro.aula7.exemplo1;

public class Veiculo {

    protected String modelo = "";

    public Veiculo(String modelo){
        this.modelo = modelo;
    }

    public void andar(){
        System.out.println("Veiculo Andando");
    }

    public void abastecer(){
        System.out.println("Abastecendo");
    }
}
