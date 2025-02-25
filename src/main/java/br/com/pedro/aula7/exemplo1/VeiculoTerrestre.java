package br.com.pedro.aula7.exemplo1;

public class VeiculoTerrestre extends Veiculo{
    public VeiculoTerrestre(String modelo) {
        super(modelo);
    }

    public void andar(){
        System.out.println("Veiculo Andando");
    }

}
