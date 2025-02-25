package br.com.pedro.aula7.exemplo1;

public class VeiculoAbastecivel extends Veiculo {

    public VeiculoAbastecivel(String modelo) {
        super(modelo);
    }

    public void abastecer(){
        System.out.println("Abastecendo");
    }
}
